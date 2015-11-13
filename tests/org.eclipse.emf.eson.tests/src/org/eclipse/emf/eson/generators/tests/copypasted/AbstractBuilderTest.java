package org.eclipse.emf.eson.generators.tests.copypasted;

import static org.eclipse.emf.eson.generators.tests.copypasted.BuilderUtil.countResourcesInIndex;
import static org.eclipse.emf.eson.generators.tests.copypasted.BuilderUtil.getBuilderState;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.root;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.waitForAutoBuild;

import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroManager;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Event;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.google.common.collect.Lists;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("restriction")
public abstract class AbstractBuilderTest extends Assert implements IResourceDescription.Event.Listener {
	private volatile List<Event> events = Lists.newArrayList();

	@Before
	public void setUp() throws Exception {
		assertEquals(0, countResourcesInIndex());
		assertEquals(0, root().getProjects().length);
		if (PlatformUI.isWorkbenchRunning()) {
			final IIntroManager introManager = PlatformUI.getWorkbench().getIntroManager();
			if (introManager.getIntro() != null) {
				Display.getDefault().asyncExec(new Runnable() {
					
					public void run() {
						introManager.closeIntro(introManager.getIntro());
					}
				});
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		cleanWorkspace();
		waitForAutoBuild();
		events.clear();
		getBuilderState().removeListener(this);
		assertEquals(0, countResourcesInIndex());
		assertEquals(0, root().getProjects().length);
	}

	public void descriptionsChanged(Event event) {
		this.events.add(event);
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
}