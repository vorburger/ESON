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
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.addBuilder;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.addNature;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.monitor;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.reallyWaitForAutoBuild;
import static org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil.addToClasspath;
import static org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil.createJavaProject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

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
import com.google.common.io.CharStreams;
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

    // TODO plugin.xml something like https://github.com/TemenosDS/com.temenos.ds.op/blob/master/base/tests/com.temenos.ds.op.xtext.tests/plugin.xml
    
    // This is a minimalistic IGenerator implementation using the dynamic EMF API
    private static final String MINIMAL_VALID_DYNAMIC_GENERATOR = "package test;\n" + 
            "import org.eclipse.emf.ecore.resource.Resource;\n" +
            "import org.eclipse.emf.ecore.EObject;\n" +
            "import org.eclipse.xtext.generator.IFileSystemAccess;\n" + 
            "import org.eclipse.xtext.generator.IGenerator;\n\n" + 
            "public class Generator implements IGenerator {\n" + 
            "  @Override\n" + 
            "  public void doGenerate(Resource input, IFileSystemAccess fsa) {\n" +
            "    EObject eo = input.getContents().get(1); // 1 instead of 0 for ESON\n" +
            "    Object name = eo.eGet(eo.eClass().getEStructuralFeature(\"name\"));\n" +
            "    fsa.generateFile(input.getURI().lastSegment() + \".inproject.txt\", \"hello \" + name);\n" + 
            "  }\n}";
    
    @Test
    public void testXtextBuilderWithGeneratorInRuntimeWorkspace() throws Exception {
        IJavaProject javaProject = createXtextJavaProject("testGeneratorInProject");
        addPlatformJarToClasspath(javaProject, "org.eclipse.emf.common");
        addPlatformJarToClasspath(javaProject, "org.eclipse.emf.ecore");
        addPlatformJarToClasspath(javaProject, "org.eclipse.xtext");
        
        IProject project = javaProject.getProject();
        IFile generatorJavaFile = createFile(project, "src/test/Generator.java", MINIMAL_VALID_DYNAMIC_GENERATOR);
        IFile servicesFile = createFile(project, "src/META-INF/services/org.eclipse.xtext.generator.IGenerator", "test.Generator");
        createFile(project, "src-gen/.empty", ""); // just to create the src-gen/ folder
        createFileAndAssertGenFile(project, "src-gen/Simplest.eson.inproject.txt", "hello abc");       

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
        reallyWaitForAutoBuild();
        return file;
    }
    
    protected void createFileAndAssertGenFile(IProject project, String expectedGenFileName, String expectedGenFileContent) throws Exception {
//        setDefaultOutputFolderDirectory(project, generatorID, outputFolderName);
        String minimalValidTestESON = Resources.toString(Resources.getResource(getClass(), "/res/BuilderTests/Simplest.eson"), Charsets.UTF_8);
        IFile model1 = createFile(project, "src/Simplest.eson", minimalValidTestESON);
        reallyWaitForAutoBuild();
        IFile generatedFile = project.getFile(expectedGenFileName);
        assertExists(generatedFile, expectedGenFileContent);
        deleteModelFileAndAssertGenFileAlsoGotDeleted(model1, generatedFile);
    }
/*
    protected void setDefaultOutputFolderDirectory(IProject project, String generatorID, String directoryName) {
        preferenceStoreAccess.setLanguageNameAsQualifier(generatorID);
        IPreferenceStore preferences = preferenceStoreAccess.getWritablePreferenceStore(project);
        preferences.setValue(getDefaultOutputDirectoryKey(), directoryName);
    }
*/    
    protected void assertExists(IFile file, String expectedGenFileContent) throws CoreException, UnsupportedEncodingException, IOException {
        String otherFiles = "";
        if (!file.exists()) {
            StringBuilder otherFilesBuilder = new StringBuilder();
            addMembersRecursively(otherFilesBuilder, file.getProject());
            otherFiles = otherFilesBuilder.toString();
        }
        assertTrue("Does not exist: " + file.toString() + otherFiles, file.exists());
        
        InputStream is = file.getContents(true);
        String genFileContent = CharStreams.toString(new InputStreamReader(is, file.getCharset()));
        assertEquals("Gen. File exists, but content is not as expected: " + file.toString(), expectedGenFileContent, genFileContent);
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
        reallyWaitForAutoBuild();
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
        IJavaProject javaProject = createJavaProject(name);
        IProject project = javaProject.getProject();
        addNature(project, XtextProjectHelper.NATURE_ID);
        addBuilder(project, XtextProjectHelper.BUILDER_ID);
        return javaProject;
    }
    
    protected String getDefaultOutputDirectoryKey() {
        return OUTPUT_PREFERENCE_TAG + PreferenceConstants.SEPARATOR + IFileSystemAccess.DEFAULT_OUTPUT + PreferenceConstants.SEPARATOR + OUTPUT_DIRECTORY;
    }
}
