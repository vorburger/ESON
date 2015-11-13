/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2015 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.generators.tests;

import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.OUTPUT_DIRECTORY;
import static org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.OUTPUT_PREFERENCE_TAG;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.addNature;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.monitor;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.waitForAutoBuild;
import static org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil.addToClasspath;
import static org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil.createJavaProject;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.eson.generators.tests.copypasted.AbstractBuilderTest;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.preferences.PreferenceConstants;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

/**
 * Integration Test for org.eclipse.emf.eson.generators.DelegatingGenerator.
 * 
 * Based on https://github.com/TemenosDS/com.temenos.ds.op/blob/master/base/tests/com.temenos.ds.op.xtext.tests/src/com/temenos/ds/op/xtext/generator/tests/MultiGeneratorXtextBuilderParticipantTest.java
 * 
 * @author Michael Vorburger
 * @author Umesh Mudduraj
 */
@SuppressWarnings("restriction")
public class GeneratorsTest extends AbstractBuilderTest {

    // This is a minimalistic IGenerator implementation
    private static final String MINIMAL_VALID_GENERATOR = "package test;\nimport org.eclipse.emf.ecore.resource.Resource;\nimport org.eclipse.xtext.generator.IFileSystemAccess;\nimport org.eclipse.xtext.generator.IGenerator;\npublic class Generator implements IGenerator {\n  @Override\n public void doGenerate(Resource input, IFileSystemAccess fsa) {\n       fsa.generateFile(input.getURI().lastSegment() + \".inproject.txt\", \"hello\");\n   }\n}";
/*
    private PreferenceStoreAccessImpl preferenceStoreAccess;
    
    @Override
    public void setUp() throws Exception {
        super.setUp();
//        final Injector injector = NODslActivator.getInstance().getInjector();
//        participant = injector.getInstance(MultiGeneratorsXtextBuilderParticipant.class);
//        preferenceStoreAccess = participant.getPreferenceStoreAccess();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
//        participant = null;
    }
 */   
    @Test
    public void testXtextBuilderWithGeneratorInRuntimeWorkspace() throws Exception {
        IJavaProject javaProject = createXtextJavaProject("testGeneratorInProject");
        addPlatformJarToClasspath(javaProject, "org.eclipse.emf.common");
        addPlatformJarToClasspath(javaProject, "org.eclipse.emf.ecore");
        addPlatformJarToClasspath(javaProject, "org.eclipse.xtext");
        
        IProject project = javaProject.getProject();
        IFile generatorJavaFile = createFile(project, "src/test/Generator.java", MINIMAL_VALID_GENERATOR);
        IFile servicesFile = createFile(project, "src/META-INF/services/org.eclipse.xtext.generator.IGenerator", "test.Generator");
        createFileAndAssertGenFile(project, "src/Minimal3.xtext", /*"test.Generator", "./src-gen", */"src-gen/Minimal3.xtext.inproject.txt");       
//        createFileAndAssertGenFile(project, "src/Minimal3.xtext", /*"test.Generator", "./gen", */ "gen/Minimal3.xtext.inproject.txt");       

        // TODO CHANGE generator, in running IDE, and make sure new file gets gen and no longer old one

        generatorJavaFile.delete(true, monitor());
        servicesFile.delete(true, monitor());
    }
    
    @Test
    public void testXtextBuilderWithGeneratorInPlugin() throws Exception {
        IProject project = createXtextJavaProject("testGeneratorFromPlugin").getProject();
        fail("TODO");
    }
    
    protected IFile createFile(IProject project, String fileName, String fileContent) throws CoreException {
        IFile file = project.getFile(fileName);
        IFolder parentFolder = (IFolder) file.getParent();
        mkdirs(parentFolder);
        file.create(new StringInputStream(fileContent), true, monitor());
        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor());
        waitForAutoBuild();
        return file;
    }
    
    protected void createFileAndAssertGenFile(IProject project, String sourceFileName, /*String generatorID, String outputFolderName, */String expectedGenFileName) throws Exception {
//        setDefaultOutputFolderDirectory(project, generatorID, outputFolderName);
        String minimalValidTestESON = Resources.toString(Resources.getResource(getClass(), "/res/BuilderTests/Simplest.eson"), Charsets.UTF_8);
        IFile model1 = createFile(project, sourceFileName, minimalValidTestESON );
        waitForAutoBuild();
        IFile generatedFile = project.getFile(expectedGenFileName);
        assertExists(generatedFile);
        deleteModelFileAndAssertGenFileAlsoGotDeleted(model1, generatedFile);
    }
/*
    protected void setDefaultOutputFolderDirectory(IProject project, String generatorID, String directoryName) {
        preferenceStoreAccess.setLanguageNameAsQualifier(generatorID);
        IPreferenceStore preferences = preferenceStoreAccess.getWritablePreferenceStore(project);
        preferences.setValue(getDefaultOutputDirectoryKey(), directoryName);
    }
*/    
    protected void assertExists(IFile file) throws CoreException {
        String otherFiles = "";
        if (!file.exists()) {
            StringBuilder otherFilesBuilder = new StringBuilder();
            addMembersRecursively(otherFilesBuilder, file.getProject());
            otherFiles = otherFilesBuilder.toString();
        }
        assertTrue("Does not exist: " + file.toString() + otherFiles, file.exists());
    }
    
    protected void addMembersRecursively(StringBuilder sb, IContainer container) throws CoreException {
        for (IResource member : container.members()) {
            sb.append('\n');
            sb.append(member.toString());
            if (member instanceof IContainer)
                addMembersRecursively(sb, (IContainer) member);
        } 
    }
    
    protected void mkdirs(IFolder folder) throws CoreException {
        if (folder.exists())
            return;
        IContainer container = folder.getParent();
        if (!container.exists())
            mkdirs((IFolder) container);
        folder.create(true, true, monitor());
    }
    
    protected void deleteModelFileAndAssertGenFileAlsoGotDeleted(IFile file, IResource generatedFile) throws Exception {
        file.delete(true, monitor());
        waitForAutoBuild();
        assertTrue("Does still exist, was not deleted: " + generatedFile.toString(), !generatedFile.exists());
    }
    
    // TODO propose this for core Xtext org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil
    // It's existing addPlatformJarToClasspath(Plugin srcPlugin, String jarFileName, IJavaProject destProject) could be renamed (or deprecated and a new method introduced) 
    // to the perhaps much clearer addResourceFromInsidePlatformJarToClasspath() - because that's what that does.
    protected IClasspathEntry addPlatformJarToClasspath(IJavaProject destJavaProject, String srcPluginID) throws JavaModelException {
        // Inspired by org.eclipse.xtend.ide.tests.macros.ActiveAnnotationsProcessingInIDETest
        // see also org.eclipse.xtend.ide.tests.WorkbenchTestHelper with more possibly useful helpers for tests like this
        // For now we can keep it simply and use only JavaProjectSetupUtil here.
        @SuppressWarnings("deprecation")
        Plugin srcPlugin = Platform.getPlugin(srcPluginID);
        if (srcPlugin == null)
            throw new IllegalArgumentException("Plugin not found: " + srcPluginID);
        String location = srcPlugin.getBundle().getLocation();
        final String PREFIX = "reference:file:";
        if (!location.startsWith(PREFIX)) {
            throw new IllegalStateException(location + " does not start with expected prefix " + PREFIX);
        }
        location = location.substring(PREFIX.length()); // chop off prefix
        IPath path = new Path(location);
        final IClasspathEntry newClassPathEntry = JavaCore.newLibraryEntry(path, null, null);
        addToClasspath(destJavaProject, newClassPathEntry);
        return newClassPathEntry;
    }
    
    protected IJavaProject createXtextJavaProject(String name) throws CoreException {
        IJavaProject project = createJavaProject(name);
        addNature(project.getProject(), XtextProjectHelper.NATURE_ID);
        return project;
    }
    
    protected String getDefaultOutputDirectoryKey() {
        return OUTPUT_PREFERENCE_TAG + PreferenceConstants.SEPARATOR + IFileSystemAccess.DEFAULT_OUTPUT + PreferenceConstants.SEPARATOR + OUTPUT_DIRECTORY;
    }
}
