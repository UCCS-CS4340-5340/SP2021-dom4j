package org.dom4j;

import org.testng.annotations.Test;
import org.mockito.Mockito;
import static org.testng.AssertJUnit.*;

public class QNameTest {
	// jm-62
	// Test that the qualified name constructor correctly sets name, namespace, and qualifiedName on the QName object
	@Test
	public void testQualifiedNameConstructor() {
		Namespace namespace = Mockito.mock(Namespace.class);
		QName qName = new QName("name", namespace, "qualifiedName");
		assertTrue("Qualified name constructor properly sets values", qName.getName().equals("name") && qName.getNamespace().equals(namespace) && qName.getQualifiedName().equals("qualifiedName"));
	}
	
	// jm-63
	// Test that get(string, string) creates a QName when an existing one with the argument details doesn't exist in the cache
	@Test
	public void testGetQualifiedAndURI() {
		QName qName = QName.get("qualifiedName", "uri");
		assertTrue("QName.get static method creates a QName when passed a qualified name and uri and it doesn't exist in cache" + qName.getQualifiedName().equals("qualifiedName"), qName.getNamespaceURI().equals("uri"));
	}
}
