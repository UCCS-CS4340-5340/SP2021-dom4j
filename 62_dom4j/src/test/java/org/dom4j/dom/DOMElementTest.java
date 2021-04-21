package org.dom4j.dom;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import org.dom4j.Attribute;
import org.mockito.Mockito;

public class DOMElementTest {
	// jm-69
	// Verifies that the createAttribute method correctly creates a dom4j attribute from an org.w3c.dom.Attr attribute
	@Test
	public void testCreateAttribute() {
		DOMElement element = new DOMElement("test");
		org.w3c.dom.Attr attr = Mockito.mock(org.w3c.dom.Attr.class);
		Mockito.when(attr.getName()).thenReturn("attribute");
		Mockito.when(attr.getLocalName()).thenReturn(null);
		Mockito.when(attr.getValue()).thenReturn("value");
		Attribute attribute = element.createAttribute(attr);
		assertTrue("createAttribute correctly creates an org.dom4j.Attribute", attribute.getValue().equals("value"));
	}
	
	// jm-70
	// Checks that createAttribute creates a dom4j attribute when local name is specified in the argument Attr
	@Test
	public void testCreateAttributeWithLocalName() {
		DOMElement element = new DOMElement("test");
		org.w3c.dom.Attr attr = Mockito.mock(org.w3c.dom.Attr.class);
		Mockito.when(attr.getLocalName()).thenReturn("local name");
		Mockito.when(attr.getValue()).thenReturn("value");
		Mockito.when(attr.getPrefix()).thenReturn("prefix");
		Mockito.when(attr.getNamespaceURI()).thenReturn("uri");
		Attribute attribute = element.createAttribute(attr);
		assertTrue("createAttribute correctly creates an org.dom4j.Attribute when the argument has non-null local name", attribute.getValue().equals("value"));
	}
}