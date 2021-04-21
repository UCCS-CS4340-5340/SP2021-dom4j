package org.dom4j.bean;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import org.dom4j.QName;

public class BeanAttributeListTest {
	// jm-54
	// Checks that a BeanAttribute can be created from a BeanElement
	@Test
	public void testCreateAttribute() {
		BeanElement parent = new BeanElement(new QName("parent"));
		BeanElement other = new BeanElement(new QName("other"));
		BeanAttributeList list = new BeanAttributeList(parent);
		assertTrue("createAttribute works properly", list.createAttribute(other, 0) instanceof BeanAttribute);
	}
}
