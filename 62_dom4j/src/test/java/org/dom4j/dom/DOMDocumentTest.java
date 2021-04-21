package org.dom4j.dom;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

import org.mockito.Mockito;


public class DOMDocumentTest {
	
	// Added in 2-1
	// Verifies that an exception is thrown when an invalid node is passed into append()
	@Test(expectedExceptions = org.w3c.dom.DOMException.class)
	public void testCheckNewChildNodeException() {
		DOMDocument doc = new DOMDocument();
		org.w3c.dom.Node child = Mockito.mock(org.w3c.dom.Node.class);
		Mockito.when(child.getNodeType()).thenReturn(org.w3c.dom.Node.CDATA_SECTION_NODE);
		doc.appendChild(child);
	}
}
