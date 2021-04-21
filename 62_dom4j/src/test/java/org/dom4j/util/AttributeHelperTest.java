package org.dom4j.util;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.*;

import org.dom4j.AbstractTestCase;
import org.mockito.Mockito;
import org.dom4j.Attribute;

// Adds more tests for the AttributeHelper class
public class AttributeHelperTest extends AbstractTestCase {
	// jm-20
	// Tests that booleanValue() returns the correct value when passed an Attribute with boolean data
	@Test
	public void testAttributeBooleanValue() {
		Attribute attr = Mockito.mock(Attribute.class);
		Mockito.when(attr.getData()).thenReturn(false);
		
		assertTrue("attributeBooleanValue returns attribute data (boolean) if the attribute is a boolean", !AttributeHelper.booleanValue(attr));
	}
	
	// jm-21
	// Tests that booleanValue() returns the correct value when passed an Attribute with data "true"
	@Test
	public void testAttributeBooleanValueString() {
		Attribute attr = Mockito.mock(Attribute.class);
		Mockito.when(attr.getData()).thenReturn("true");
		
		assertTrue("attributeBooleanValue returns true if data is string 'true' and not a boolean", AttributeHelper.booleanValue(attr));
	}
	
	// jm-22
	// Tests that booleanValue() returns the correct value when passed an Attribute with null data
	@Test
	public void testAttributeBooleanValueNull() {
		Attribute attr = Mockito.mock(Attribute.class);
		Mockito.when(attr.getData()).thenReturn(null);
		
		assertTrue("attributeBooleanValue returns false if data is not a boolean or the string 'true'", !AttributeHelper.booleanValue(attr));
	}
}
