package org.dom4j.bean;

import org.testng.annotations.Test;
import org.dom4j.Element;
import org.dom4j.QName;
import org.mockito.Mockito;

public class BeanElementTest {
	// jm-55
	// Checks that an exception is thrown when attempting to add an Attribute to a BeanElement
	@Test(expectedExceptions = java.lang.ClassCastException.class)
	public void testAddAttributeException() {
		QName qName = Mockito.mock(QName.class);
		BeanElement bean = new BeanElement(qName);
		Element e = bean.addAttribute("name", "value");		
	}
}
