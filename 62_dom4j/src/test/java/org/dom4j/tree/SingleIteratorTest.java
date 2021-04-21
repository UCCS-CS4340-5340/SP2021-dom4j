package org.dom4j.tree;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class SingleIteratorTest {
	// jm-43
	// Test that hasNext returns true after being initialized
	@Test
	public void testHasNext() {
		SingleIterator<Integer> iterator = new SingleIterator<Integer>(2);
		assertTrue("hasNext returns true after first being initialized", iterator.hasNext());
	}
	
	// jm-44
	// Test that next returns the original object passed in via constructor and sets hasNext to false
	@Test
	public void testNext() {
		SingleIterator<Integer> iterator = new SingleIterator<Integer>(2);
		assertTrue("next() returns object", iterator.next() == 2 && iterator.hasNext() == false);
	}
	
	// jm-45
	// Test that remove() throws an exception
	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void testRemove() {
		SingleIterator<Integer> iterator = new SingleIterator<Integer>(2);
		iterator.remove();
	}
}
