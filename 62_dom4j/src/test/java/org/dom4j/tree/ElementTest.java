package org.dom4j.tree;

import org.dom4j.AbstractTestCase;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.testng.annotations.Test;
import org.dom4j.QName;
import static org.testng.AssertJUnit.*;

import java.util.Arrays;

import org.mockito.Mockito;

// Test BaseElement (implements Element)
public class ElementTest extends AbstractTestCase {
	// jm-33
	// Verify that BaseElement.isRootElement() returns false if it's not in a document
	@Test
	public void testIsRootElementFalse() {
		BaseElement element = new BaseElement("");
		assertTrue("BaseElement.isRootElement() returns false when not part of a document", !element.isRootElement());
	}
	
	// jm-34
	// Verify that the Element's QName constructor works as expected
	@Test
	public void testQNameConstructor() {
		QName qName = Mockito.mock(QName.class);
		BaseElement element = new BaseElement(qName);

		assertTrue("QName constructor properly sets QName", element.getQName().equals(qName));
	}
	
	// jm-35
	// Verify that Element's setContent method correctly sets the content list to the argument value
	@Test
	public void testSetContent() {
		BaseElement element = new BaseElement("");
		Node node = Mockito.mock(Node.class);
		element.setContent(Arrays.asList(node));

		assertTrue("setContent() correctly sets element content", element.content().get(0).equals(node));
	}
	
	// jm-36
	// Similar to jm-35 but tests behavior when passing a ContentListFacade
	@Test
	public void testSetContentFacade() {
		BaseElement element = new BaseElement("");
		Node node = Mockito.mock(Node.class);
		AbstractBranch branch = Mockito.mock(AbstractBranch.class);
		ContentListFacade<Node> content = new ContentListFacade<Node>(branch, Arrays.asList(node));
		element.setContent(content);

		assertTrue("setContent() correctly sets element content when given ContentListFacade", element.content().get(0).equals(node));
	}
	
	// jm-37
	// Test that the Element's Attribute list can be set properly
	@Test
	public void testSetAttributes() {
		BaseElement element = new BaseElement("");
		Attribute attr = Mockito.mock(Attribute.class);
		element.setAttributes(Arrays.asList(attr));


		assertTrue("setAttributes() correctly sets attributes", element.attributes().get(0).equals(attr));
	}

}
