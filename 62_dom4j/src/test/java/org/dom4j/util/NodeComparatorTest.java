package org.dom4j.util;

import org.dom4j.*;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

// Test NodeComparator compare methods which were not previously tested
public class NodeComparatorTest {
	
	// jm-41
	// Test the NodeComparator's compare method with different DocumentTypes
	@Test
	public void testDocumentCompareDifferent() {
		DocumentType doc1 = Mockito.mock(DocumentType.class);
		Mockito.when(doc1.getPublicID()).thenReturn("1");
		Mockito.when(doc1.getSystemID()).thenReturn("1");
		Mockito.when(doc1.getName()).thenReturn("1");

		DocumentType doc2 = Mockito.mock(DocumentType.class);
		Mockito.when(doc2.getPublicID()).thenReturn("2");
		Mockito.when(doc2.getSystemID()).thenReturn("2");
		Mockito.when(doc2.getName()).thenReturn("2");
		
		NodeComparator comparator = new NodeComparator();
		
		assertTrue("Comparing documents returns -1 when documents are different", comparator.compare(doc1, doc2) == -1);
	}
	
	// jm-42
	// Test the NodeComparator's compare method with two different DocumentTypes that have the same value
	@Test
	public void testDocumentCompareSame() {
		DocumentType doc1 = Mockito.mock(DocumentType.class);
		Mockito.when(doc1.getPublicID()).thenReturn("1");
		Mockito.when(doc1.getSystemID()).thenReturn("1");
		Mockito.when(doc1.getName()).thenReturn("1");

		DocumentType doc2 = Mockito.mock(DocumentType.class);
		Mockito.when(doc2.getPublicID()).thenReturn("1");
		Mockito.when(doc2.getSystemID()).thenReturn("1");
		Mockito.when(doc2.getName()).thenReturn("1");
		
		NodeComparator comparator = new NodeComparator();
		
		assertTrue("Comparing documents returns 0 when documents have same values but are not same object", comparator.compare(doc1, doc2) == 0);
	}
}
