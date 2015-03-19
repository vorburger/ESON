package org.eclipse.emf.eson.util.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.eson.scoping.DottedQualifiedNameFixer;
import org.eclipse.xtext.naming.QualifiedName;
import org.junit.Test;

public class DottedQualifiedNameFixerTest {

	@Test public void nameWithNoDots() {
		QualifiedName qn = QualifiedName.create("someName");
		assertEquals(1, qn.getSegmentCount());

		qn = DottedQualifiedNameFixer.split(qn);
		assertEquals(1, qn.getSegmentCount());
		assertEquals("someName", qn.getSegment(0));		
	}

	@Test public void nameWithOneDot() {
		QualifiedName qn = QualifiedName.create("STRANGE.NAME");
		assertEquals(1, qn.getSegmentCount());

		qn = DottedQualifiedNameFixer.split(qn);
		assertEquals(2, qn.getSegmentCount());
		assertEquals("STRANGE", qn.getSegment(0));
		assertEquals("NAME", qn.getSegment(1));
	}

	@Test public void nameWithTwoDots() {
		QualifiedName qn = QualifiedName.create("STRANGE.NAME.MORE");
		assertEquals(1, qn.getSegmentCount());

		qn = DottedQualifiedNameFixer.split(qn);
		assertEquals(3, qn.getSegmentCount());
		assertEquals("STRANGE", qn.getSegment(0));
		assertEquals("NAME", qn.getSegment(1));		
		assertEquals("MORE", qn.getSegment(2));		
	}
	
}
