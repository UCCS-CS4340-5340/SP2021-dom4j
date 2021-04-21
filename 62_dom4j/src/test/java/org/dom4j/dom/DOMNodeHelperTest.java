package org.dom4j.dom;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import org.dom4j.Attribute;
import org.dom4j.tree.DefaultAttribute;
import org.dom4j.tree.DefaultElement;
import org.dom4j.tree.FlyweightText;

public class DOMNodeHelperTest {
	// jm-46
	// Tests that DOMNodeHelper.setValue(Node, String) correctly sets a DefaultElement's text
	@Test
	public void testSetNodeValueString() {
		DefaultElement element = new DefaultElement("test");
		DOMNodeHelper.setNodeValue(element, "newValue");
		
		assertTrue("Can set DefaultElement text", element.getText().equals("newValue"));
	}
	
	// jm-47
	// Verifies that getPreviousSibling will return null if the child element has no previous siblings
	@Test
	public void testGetPreviousSiblingNull() {
		DefaultElement child = new DefaultElement("child");
		DefaultElement parent = new DefaultElement("parent");
		child.setParent(parent);
		
		assertTrue("getPreviousSibling returns null if none are found", DOMNodeHelper.getPreviousSibling(child) == null);
	}
	
	// jm-48
	// Verifies that an exception is thrown when one of the siblings is not an org.w3c.dom.Node
	@Test(expectedExceptions = org.w3c.dom.DOMException.class)
	public void testGetPreviousSiblingDOMException() {
		DefaultElement child = new DefaultElement("child");
		DefaultElement parent = new DefaultElement("parent");
		parent.add(new DefaultElement("other"));
		parent.add(child);
		
		DOMNodeHelper.getPreviousSibling(child);
	}
	
	// jm-64
	// Check that hasAttributes returns the correct boolean value when the argument has attributes
	@Test
	public void testHasAttributes() {
		DefaultElement element = new DefaultElement("test");
		element.add(new DefaultAttribute("test1", "test2"));
		assertTrue("hasAttributes returns true if argument has attributes", DOMNodeHelper.hasAttributes(element));
	}
	
	// jm-65
	// Check that hasAttributes returns the correct boolean value when the argument doesn't have attributes
	@Test
	public void testHasNoAttributes() {
		DefaultElement element = new DefaultElement("test");
		assertFalse("hasAttributes returns false if argument has no attributes", DOMNodeHelper.hasAttributes(element));
	}
	
	// jm-66
	// Test that getLength() returns the correct length when passed a FlyweightText
	@Test
	public void testGetLength() {
		assertTrue("getLength returns correct length when passed a CharacterData", DOMNodeHelper.getLength(new FlyweightText("text")) == 4);
	}
}
