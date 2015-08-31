package org.eclipse.emf.eson.tests;

import org.eclipse.emf.eson.util.tests.EcoreUtil3Test;
import org.eclipse.emf.eson.xcore.tests.XcoreTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XcoreTest.class, EcoreUtil3Test.class })
public class SomeTests {
}
