package org.dom4j.io;

import org.testng.annotations.Test;
import org.dom4j.Element;
import org.mockito.Mockito;
import static org.testng.AssertJUnit.*;


public class ElementStackTest {
	// jm-56
	// Verify that the size method returns the correct size
	@Test
	public void testSize() {
		ElementStack stack = new ElementStack();
		Element element = Mockito.mock(Element.class);
		stack.pushElement(element);
		assertTrue("ElementStack size method returns correct size", stack.size() == 1);
	}
	
	// jm-57
	// Verify that getElement() returns the element at the argument index
	@Test
	public void testGetElement() {
		ElementStack stack = new ElementStack();
		Element element1 = Mockito.mock(Element.class);
		Element element2 = Mockito.mock(Element.class);

		stack.pushElement(element1);
		stack.pushElement(element2);
		assertTrue("getElement returns correct element", stack.getElement(0).equals(element1));
	}
	
	// jm-58
	// Ensures that getElement returns null if index is out of bounds
	@Test
	public void testGetElementOutOfBounds() {
		ElementStack stack = new ElementStack();
		Element element1 = Mockito.mock(Element.class);

		stack.pushElement(element1);
		assertTrue("Returns null if index is out of bounds", stack.getElement(50) == null);	
	}
	
	// jm-59
	// Verifies that getPath() returns the correct default value
	@Test
	public void testGetPath() {
		ElementStack stack = new ElementStack();
		assertTrue("getPath returns correct default value", stack.getPath().equals("/"));
	}
	
	// jm-60
	// Tests that the stack reallocates if the size is exceeded
	@Test
	public void testAddElementReallocate() {
		ElementStack stack = new ElementStack(1);
		
		Element element1 = Mockito.mock(Element.class);
		Element element2 = Mockito.mock(Element.class);

		stack.pushElement(element1);
		stack.pushElement(element2);
		assertTrue("Can reallocate length if it is exceeded", stack.size() == 2);
	}
	

	// jm-61
	// Tests that another dispatch handler can be added to the stack
	@Test
	public void testAddHandler() {
		ElementStack stack = new ElementStack();
		DispatchHandler handler = new DispatchHandler();
		DispatchHandler other = new DispatchHandler();
		stack.setDispatchHandler(handler);
		stack.addHandler("/test", other);
		assertTrue("addHandler correctly adds a dispatch handler", stack.getDispatchHandler().getHandler("/test").equals(other));
	}
	
	// jm
	@Test
	public void testRemoveHandler() {
		ElementStack stack = new ElementStack();
		DispatchHandler handler = new DispatchHandler();
		DispatchHandler other = new DispatchHandler();
		stack.setDispatchHandler(handler);
		stack.addHandler("/test", other);
		stack.removeHandler("/test");
		assertTrue("removeHandler correctly removes a dispatch handler", stack.getDispatchHandler().getHandler("/test") == null);
	}
}
