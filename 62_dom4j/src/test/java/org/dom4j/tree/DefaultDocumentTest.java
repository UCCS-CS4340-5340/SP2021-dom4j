/*
 * Copyright 2001-2005 (C) MetaStuff, Ltd. All Rights Reserved.
 *
 * This software is open source.
 * See the bottom of this file for the licence.
 */

package org.dom4j.tree;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Some tests on DefaultDocument.
 *
 * @author <a href="mailto:maartenc@users.sourceforge.net">Maarten Coene </a>
 */
public class DefaultDocumentTest extends AbstractTestCase {
	// Test case(s)
	// -------------------------------------------------------------------------

	@Test
	public void testDoubleRootElement() {
		Document document = DefaultDocumentFactory.getInstance().createDocument();
		document.addElement("root");

		Element root = DefaultDocumentFactory.getInstance().createElement(
				"anotherRoot");

		try {
			document.add(root);
			fail();
		} catch (IllegalAddException e) {
			String msg = e.getMessage();
			assertTrue(msg.indexOf(root.toString()) != -1);
		}
	}

	@Test
	public void testBug799656() throws Exception {
		Document document = DefaultDocumentFactory.getInstance().createDocument();
		Element el = document.addElement("root");
		el.setText("text with an \u00FC in it"); // u00FC is umlaut

		System.out.println(document.asXML());

		DocumentHelper.parseText(document.asXML());
	}

	@Test
	public void testAsXMLWithEncoding() throws Exception {
		DefaultDocument document = new DefaultDocument();
		document.addElement("root");
		document.setXMLEncoding("ISO-8859-1");

		Document doc = DocumentHelper.parseText("<?xml version='1.0' "
				+ "encoding='ISO-8859-1'?><root/>");

		String xml1 = document.asXML();
		String xml2 = doc.asXML();

		assertTrue(xml1.indexOf("ISO-8859-1") != -1);
		assertTrue(xml2.indexOf("ISO-8859-1") != -1);
	}

	@Test
	public void testBug1156909() throws Exception {
		Document doc = DocumentHelper.parseText("<?xml version='1.0' "
				+ "encoding='ISO-8859-1'?><root/>");

		assertEquals("XMLEncoding not correct", "ISO-8859-1", doc
				.getXMLEncoding());
	}

	@Test
	public void testAsXMLWithEncodingAndContent() throws Exception {
		DefaultDocument document = new DefaultDocument();
		document.setXMLEncoding("UTF-16");
		Element root = document.addElement("root");
		root.setText("text with an \u00FC in it"); // u00FC is umlaut

		String xml = document.asXML();
		assertTrue(xml.indexOf("UTF-16") != -1);
		assertTrue(xml.indexOf('\u00FC') != -1);
	}

	@Test
	public void testEncoding() throws Exception {
		Document document = DefaultDocumentFactory.getInstance().createDocument(
				"koi8-r");
		Element el = document.addElement("root");
		el.setText("text with an \u00FC in it"); // u00FC is umlaut

		System.out.println(document.asXML());

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		OutputFormat of = OutputFormat.createPrettyPrint();
		of.setEncoding("koi8-r");

		XMLWriter writer = new XMLWriter(out, of);
		writer.write(document);

		String result = out.toString("koi8-r");
		System.out.println(result);

		Document doc2 = DocumentHelper.parseText(result);
		// System.out.println(doc2.asXML());

	}
	
	// jm-26
	// Test that processingInstructions() returns a list immediately after the DefaultDocument is initialized
	@Test
	public void testProcessingInstructions() {
		DefaultDocument someDocument = new DefaultDocument();

		assertTrue("Correctly returns a list", someDocument.processingInstructions().size() == 0);
	}
	
	// jm-67
	// Tests that adding a DefaultElement to a DefaultDocument at a specific index works properly
	@Test
	public void testAddNodeWithIndex() {
		DefaultDocument someDocument = new DefaultDocument();
		DefaultElement element = new DefaultElement("test");
		someDocument.addNode(0, element);
		assertTrue("Adding a node at an index works properly", someDocument.contentList().get(0).equals(element));
	}
	
	// jm-68
	// Verifies that adding a DefaultElement which already has a document throws an exception
	@Test(expectedExceptions = IllegalAddException.class)
	public void testAddNodeWithIndexException() {
		DefaultDocument someDocument = new DefaultDocument();
		DefaultDocument otherDocument = new DefaultDocument();
		DefaultElement element = new DefaultElement("test");
		element.setDocument(otherDocument);
		someDocument.addNode(0, element);
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
