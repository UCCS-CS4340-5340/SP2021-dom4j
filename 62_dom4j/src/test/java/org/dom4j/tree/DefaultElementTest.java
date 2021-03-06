/*
 * Copyright 2001-2005 (C) MetaStuff, Ltd. All Rights Reserved.
 *
 * This software is open source.
 * See the bottom of this file for the licence.
 */

package org.dom4j.tree;

import org.dom4j.*;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import static org.testng.AssertJUnit.*;

/**
 * JUnit tests for <code>DefaultElement</code>.
 *
 * @author Maarten Coene
 */
public class DefaultElementTest extends AbstractTestCase {
	// Test case(s)
	// -------------------------------------------------------------------------

	@Test
	public void testParentAfterSetContent() throws Exception {
		Document doc = DocumentHelper.parseText("<root>" + "<a>a</a>"
				+ "<b>b</b>" + "<x>x</x>" + "<d>d</d>" + "</root>");
		Node x = doc.selectSingleNode("/root/x");
		List content = doc.getRootElement().content();
		int position = content.indexOf(x);
		Element c = DocumentHelper.createElement("c");
		c.setText("c");
		content.add(position, c);
		assertNotNull(c.getParent());
		doc.getRootElement().setContent(content);
		assertNotNull("Parent is null of setting content", c.getParent());
	}

	@Test
	public void testGetStringValue() throws Exception {
		Document doc = getDocument("xml/test/test_text.xml");
		Element message = doc.getRootElement();

		String text = message.getStringValue();
		assertEquals("String value incorrect", "This should work", text.trim());

		String xpathText = (String) doc
				.selectObject("normalize-space(/message)");
		assertEquals("xpath value incorrect", "This should work", xpathText);
	}

	@Test
	public void testBug894878() {
		Element foo = DefaultDocumentFactory.getInstance().createElement("foo");
		foo.addText("bla").addAttribute("foo", "bar");
		assertEquals("<foo foo=\"bar\">bla</foo>", foo.asXML());

		foo = DefaultDocumentFactory.getInstance().createElement("foo");
		foo.addAttribute("foo", "bar").addText("bla");
		assertEquals("<foo foo=\"bar\">bla</foo>", foo.asXML());
	}

	@Test
	public void testGetNamespacesForURI() throws Exception {
		String xml = "<schema targetNamespace='http://SharedTest.org/xsd' "
				+ "        xmlns='http://www.w3.org/2001/XMLSchema' "
				+ "        xmlns:xsd='http://www.w3.org/2001/XMLSchema'>"
				+ "    <complexType name='AllStruct'>" + "        <all>"
				+ "            <element name='arString' type='xsd:string'/>"
				+ "            <element name='varInt' type='xsd:int'/>"
				+ "        </all>" + "    </complexType>" + "</schema>";
		Document doc = DocumentHelper.parseText(xml);
		Element schema = doc.getRootElement();
		List namespaces = schema
				.getNamespacesForURI("http://www.w3.org/2001/XMLSchema");

		assertNotNull(namespaces);
		assertEquals(2, namespaces.size());
	}

	@Test
	public void testDeclaredNamespaces() throws Exception {
		String xml = "<a xmlns:ns1=\"uri1\">" + "    <ns1:b/>"
				+ "    <ns2:c xmlns:ns2=\"uri2\"/>" + "</a>";
		Document doc = DocumentHelper.parseText(xml);

		Element a = doc.getRootElement();
		List ns = a.declaredNamespaces();
		assertEquals(1, ns.size());
		assertSame(a.getNamespaceForPrefix("ns1"), ns.get(0));

		Element b = a.element("b");
		ns = b.declaredNamespaces();
		assertEquals(0, ns.size());

		Element c = a.element("c");
		ns = c.declaredNamespaces();
		assertEquals(1, ns.size());
		assertSame(c.getNamespaceForPrefix("ns2"), ns.get(0));
	}

	@Test
	public void testAdditionalNamespaces() throws Exception {
		String xml = "<a xmlns:ns1=\"uri1\">" + "    <ns1:b/>"
				+ "    <ns2:c xmlns:ns2=\"uri2\"/>" + "</a>";
		Document doc = DocumentHelper.parseText(xml);

		Element a = doc.getRootElement();
		List ns = a.additionalNamespaces();
		assertEquals(1, ns.size());
		assertSame(a.getNamespaceForPrefix("ns1"), ns.get(0));

		Element b = a.element("b");
		ns = b.additionalNamespaces();
		assertEquals(0, ns.size());

		Element c = a.element("c");
		ns = c.additionalNamespaces();
		assertEquals(0, ns.size());
	}
	
	// jm-38
	// Test that processingInstructions() retrieves an instruction added to a DefaultElement
	@Test
	public void testProcessingInstructions() {
		DefaultElement element = new DefaultElement("");
		
		element.addProcessingInstruction("target", "");
		ProcessingInstruction ins = element.processingInstructions().get(0);
		assertTrue("processingInstructions() correctly retrieves the processing instructions", ins.getTarget().equals("target"));
	}
	
	// jm-39
	// Test that removeProcessingInstruction can remove an instruction
	@Test
	public void testRemoveProcessingInstruction() {
		DefaultElement element = new DefaultElement("");
		
		element.addProcessingInstruction("target", "");
		
		// If the instruction wasn't added, this line will cause the test to fail
		element.processingInstructions().get(0);
		
		element.removeProcessingInstruction("target");
		
		assertTrue("removeProcessingInstruction correctly removes a processing instructions", element.processingInstructions().size() == 0);
	}
	
	// jm-40
	// Test that setting the attributes of a DefaultElement works as expected
	@Test
	public void testSetAttributes() {
		DefaultElement element = new DefaultElement("");
		Attribute attr1 = Mockito.mock(Attribute.class);
		Attribute attr2 = Mockito.mock(Attribute.class);
		List<Attribute> attrs = Arrays.asList(attr1, attr2);
		element.setAttributes(attrs);
		
		assertTrue("setAttributes correctly sets attribute list", element.attributes().get(0).equals(attr1) && element.attributes().get(1).equals(attr2));
		
	}
	
	// jm-72
	// Tests superclass node(int)
	@Test
	public void testNode() {
		DefaultElement parent = new DefaultElement("parent");
		DefaultElement child = new DefaultElement("child");
		parent.addNode(child);
		assertTrue("Superclass node(int) method works properly", parent.node(0).equals(child));
	}
}

/*
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided that the
 * following conditions are met:
 * 
 * 1. Redistributions of source code must retain copyright statements and
 * notices. Redistributions must also contain a copy of this document.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * 3. The name "DOM4J" must not be used to endorse or promote products derived
 * from this Software without prior written permission of MetaStuff, Ltd. For
 * written permission, please contact dom4j-info@metastuff.com.
 * 
 * 4. Products derived from this Software may not be called "DOM4J" nor may
 * "DOM4J" appear in their names without prior written permission of MetaStuff,
 * Ltd. DOM4J is a registered trademark of MetaStuff, Ltd.
 * 
 * 5. Due credit should be given to the DOM4J Project - http://dom4j.sourceforge.net
 * 
 * THIS SOFTWARE IS PROVIDED BY METASTUFF, LTD. AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL METASTUFF, LTD. OR ITS CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * Copyright 2001-2005 (C) MetaStuff, Ltd. All Rights Reserved.
 */
