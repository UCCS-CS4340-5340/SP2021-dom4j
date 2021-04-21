package org.dom4j;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.*;

import org.mockito.Mockito;

// New test file added in Sprint 1-2 to test currently-untested methods in org.dom4j.DocumentHelper
public class DocumentHelperTest extends AbstractTestCase {
	
	// jm-12
	// Tests that createAttribute correctly creates and returns an Attribute object
	@Test
	public void testCreateAttribute() {
		Element element = Mockito.mock(Element.class);
		QName qName = Mockito.mock(QName.class);
		Attribute attribute = DocumentHelper.createAttribute(element, qName, "test");
		
		assertTrue("Attribute value is correct", attribute.getValue().equals("test"));
		assertTrue("Attribute QName is correct", attribute.getQName().equals(qName));

	}
	
	// jm-13
	// Tests that createEntity correctly creates and returns an Entity object
	@Test
	public void testCreateEntity() {
		Entity entity = DocumentHelper.createEntity("name", "text");
		
		assertTrue("Entity name is correct", entity.getName().equals("name"));
		assertTrue("Entity value is correct", entity.getText().equals("text"));
	}
	
	
	// jm-14
	// Tests that createText correctly creates and returns a Text object
	@Test
	public void testCreateText() {
		Text text = DocumentHelper.createText("text");
		assertTrue("Text is correct", text.getText().equals("text"));
	}
	
	// jm-15
	// Tests that createQName correctly creates a QName when given a namespace in addition to a name
	@Test
	public void testCreateQNameWithNamespace() {
		Namespace namespace = Mockito.mock(Namespace.class);
		QName qName = DocumentHelper.createQName("name", namespace);
		assertTrue("Name is correct", qName.getName().equals("name"));
		assertTrue("Namespace is correct", qName.getNamespace().equals(namespace));
	}

}
