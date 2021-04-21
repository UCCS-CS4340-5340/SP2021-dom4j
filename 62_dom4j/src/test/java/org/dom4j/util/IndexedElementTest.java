package org.dom4j.util;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import java.util.Arrays;
import java.util.List;

import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultAttribute;
import org.dom4j.tree.DefaultElement;
import org.mockito.Mockito;


public class IndexedElementTest {
	// jm-49
	// Checks that a DefaultElement can be added to an IndexedElement
	@Test
	public void testAddElementNode() { 
		IndexedElement element = new IndexedElement("test");
		element.elementIndex();
		QName name = new QName("name");
		DefaultElement node = new DefaultElement(name);
		
		element.addNode(node);
		assertTrue("Can add a DefaultElement to an IndexedElement", element.elementIndex().get(name).get(0).equals(node));
	}
	
	// jm-50
	// Checks that a DefaultAttribute can be added to an IndexedElement
	@Test
	public void testAddAttributeNode() { 
		IndexedElement element = new IndexedElement("test");
		element.attributeIndex();
		QName name = new QName("name");
		DefaultAttribute node = new DefaultAttribute(name);
		
		element.addNode(node);
		assertTrue("Can add a DefaultAttribue to an IndexedElement", element.attributeIndex().get(name).equals(node));
	}
	
	// jm-51
	// Checks that a DefaultElement can be removed from an IndexedElement
	@Test
	public void testRemoveElementNode() {
		IndexedElement element = new IndexedElement("test");
		element.elementIndex();
		QName name = new QName("name");
		DefaultElement node = new DefaultElement(name);
		
		element.addNode(node);
		element.removeNode(node);
		assertTrue("Can remove a DefaultElement from an IndexedElement", element.elementIndex().get(name) == null);
	}
	
	// jm-52
	// Tests that a DefaultAttribute can be removed from an IndexedElement
	@Test
	public void testRemoveAttributeNode() {
		IndexedElement element = new IndexedElement("test");
		element.attributeIndex();
		QName name = new QName("name");
		DefaultAttribute node = new DefaultAttribute(name);
		
		element.addNode(node);
		element.removeNode(node);
		assertTrue("Can remove a DefaultAttribute from an IndexedElement", element.attributeIndex().get(name) == null);
	}
	
	// jm-53
	// Verifies that asElementList returns a list of elements in the argument list
	@Test
	public void testAsElementList() {
		IndexedElement element = new IndexedElement("test");
		Element child = Mockito.mock(Element.class);
		List<Element> list = Arrays.asList(child);
		
		assertTrue("asElementList correctly returns a list", element.asElementList(list).size() == 1 && element.asElementList(list).get(0).equals(child));
	}
	
	// jm-71
	// Tests that firstElement returns the first element of the argument list
	@Test
	public void testFirstElement() {
		Element element = new IndexedElement("test");
		List<Element> list = Arrays.asList(element);
		assertTrue("IndexedElement.firstElement correctly returns first element of element list", IndexedElement.firstElement(list).equals(element));
	}
}
