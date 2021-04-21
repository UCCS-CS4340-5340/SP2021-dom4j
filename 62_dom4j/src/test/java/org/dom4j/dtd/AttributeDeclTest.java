/*
 * Copyright 2001-2005 (C) MetaStuff, Ltd. All Rights Reserved.
 *
 * This software is open source.
 * See the bottom of this file for the licence.
 */

package org.dom4j.dtd;

import junit.textui.TestRunner;
import org.dom4j.AbstractTestCase;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Tests the {@link AttributeDecl}functionality. Tests each of the property
 * access methods and the serialization mechanisms. Correct parsing is tested by
 * {@link DocTypeTest}.
 * <p/>
 * <p>
 * There are several key variations that need to be tested both here and in
 * {@link DocTypeTest}, which is responsible for testing correct parsing of the
 * {@link DocumentType}. Those variations include the different
 * <code>valueDefault</code> and <code>value</code> variations so that we
 * can test for correct acceptance and correct rejection of attribute
 * declarations.
 * </p>
 * <p/>
 * <p>
 * </p>
 *
 * @author Bryan Thompson
 * @author Maarten Coene
 * @version $Revision: 1.3 $
 * @todo The dom4j documentation needs to describe what representation SHOULD be
 * generated by {@link AttributeDecl#toString()}.
 * @todo The dom4j AttributeDecl should expose some methods that make it easier
 * for people to use the DTD grammar, e.g., isFixed(), isRequired(),
 * isImplied().
 */
public class AttributeDeclTest extends AbstractTestCase {
	public static void main(String[] args) {
		TestRunner.run(AttributeDeclTest.class);
	}

	// Test case(s)
	// -------------------------------------------------------------------------

	/**
	 * Test
	 * <p/>
	 * <pre>
	 * <p/>
	 *  &lt;!ATTLIST foo bar ID #IMPLIED&gt;
	 * <p/>
	 * </pre>.
	 */
	@Test
	public void testIdImpliedNone() {
		MyTestAttributeDecl decl = new MyTestAttributeDecl("foo", // elementName
				"bar", // attributeName
				"ID", // type
				"#IMPLIED", // valueDefault
				null, // value
				"<!ATTLIST foo bar ID #IMPLIED>");
		assertSameAttributeDecl(decl, new AttributeDecl("foo", "bar", "ID",
				"#IMPLIED", null));
	}

	/**
	 * Test
	 * <p/>
	 * <pre>
	 * <p/>
	 *  &lt;!ATTLIST foo bar CDATA #FIXED \&quot;goo\&quot;&gt;
	 * <p/>
	 * </pre>.
	 */
	@Test
	public void testCDataFixedValue() {
		MyTestAttributeDecl decl = new MyTestAttributeDecl("foo", // elementName
				"bar", // attributeName
				"CDATA", // type
				"#FIXED", // valueDefault
				"goo", // value
				"<!ATTLIST foo bar CDATA #FIXED \"goo\">");
		assertSameAttributeDecl(decl, new AttributeDecl("foo", "bar", "CDATA",
				"#FIXED", "goo"));
	}

	/**
	 * Test
	 * <p/>
	 * <pre>
	 * <p/>
	 *  &lt;!ATTLIST foo bar CDATA &quot;goo&quot;&gt;
	 * <p/>
	 * </pre>.
	 */
	@Test
	public void testCDataNoneValue() {
		MyTestAttributeDecl decl = new MyTestAttributeDecl("foo", // elementName
				"bar", // attributeName
				"CDATA", // type
				null, // valueDefault
				"goo", // value
				"<!ATTLIST foo bar CDATA \"goo\">");
		assertSameAttributeDecl(decl, new AttributeDecl("foo", "bar", "CDATA",
				null, "goo"));
	}
	
	// Setter tests added in 2-1
	@Test
	public void testSetElementName() {
		AttributeDecl decl = new AttributeDecl();
		decl.setElementName("elementName");
		assertTrue(decl.getElementName().equals("elementName"));
	}
	
	@Test
	public void testSetAttributeName() {
		AttributeDecl decl = new AttributeDecl();
		decl.setAttributeName("attributeName");
		assertTrue(decl.getAttributeName().equals("attributeName"));
	}
	
	@Test
	public void testSetType() {
		AttributeDecl decl = new AttributeDecl();
		decl.setType("type");
		assertTrue(decl.getType().equals("type"));
	}
	
	@Test
	public void testSetValue() {
		AttributeDecl decl = new AttributeDecl();
		decl.setValue("value");
		assertTrue(decl.getValue().equals("value"));
	}
	
	@Test
	public void testSetValueDefault() {
		AttributeDecl decl = new AttributeDecl();
		decl.setValueDefault("valueDefault");
		assertTrue(decl.getValueDefault().equals("valueDefault"));
	}



	// Implementation methods
	// -------------------------------------------------------------------------

	protected void assertSameAttributeDecl(MyTestAttributeDecl expected,
	                                       AttributeDecl actual) {
		assertEquals("elementName is correct", expected.getElementName(),
				actual.getElementName());

		assertEquals("attributeName is correct", expected.getAttributeName(),
				actual.getAttributeName());

		assertEquals("type is correct", expected.getType(), actual.getType());

		assertEquals("valueDefault is correct", expected.getValueDefault(),
				actual.getValueDefault());

		assertEquals("toString() is correct", expected.getText(), actual
				.toString());
	}
	
	/**
	 * Helper is useful since we are trying to exhaustively test the ATTLIST
	 * variations and their correct serialization.
	 */
	protected static class MyTestAttributeDecl {
		private String elName;

		private String attName;

		private String declType;

		private String defaultValue;

		private String declValue;

		private String txt;

		/**
		 * DOCUMENT ME!
		 *
		 * @param elementName   The name of the element whose attribute is being
		 *                      described.
		 * @param attributeName The name of the attribute.
		 * @param type          The type of the declared attribute, e.g., CDATA, ID,
		 *                      IDREF, IDREFS, ENTITY, ENTITIES, NMTOKEN, NKTOKENS
		 * @param valueDefault  The type of default that applies for this attribute
		 *                      declaration, e.g., #REQUIRED, #IMPLIED, #FIXED (in which
		 *                      case the <i>value </i> MUST be non- <code>null</code>
		 *                      and specifies the fixed value for the attribute, or
		 *                      <code>null</code> if no valueDefault was specified in
		 *                      the attribute declaration (in which case the <i>value </i>
		 *                      MUST be non- <code>null</code> and specifies the default
		 *                      value for the attribute).
		 * @param value         The value of the attribute assigned in the attribute
		 *                      declaration -or- <code>null</code> if no value was
		 *                      provided in the attribute declaration. The value MUST be
		 *                      <code>null</code> unless the <i>valueDefault </i> is
		 *                      either "#FIXED" or <code>null</code>.
		 * @param text          The text representation of the attribute declaration,
		 *                      e.g., <code>&lt;!ATTLIST foo id ID #IMPLIED&gt;</code>.
		 * @todo The constructor and properties in {@link AttributeDecl}should
		 * have some similar javadoc so that people more easily understand
		 * the interaction and difference between the <i>valueDefault </i>
		 * and <i>value </i> properties. The constructor SHOULD be clear
		 * about whether and when the <code>valueDefault</code> and
		 * <code>value</code> properties MUST be <code>null</code>.
		 */
		public MyTestAttributeDecl(String elementName, String attributeName,
		                           String type, String valueDefault, String value, String text) {
			elName = elementName;

			attName = attributeName;

			declType = type;

			defaultValue = valueDefault;

			declValue = value;

			txt = text;
		}

		public String getElementName() {
			return elName;
		}

		public String getAttributeName() {
			return attName;
		}

		public String getType() {
			return declType;
		}

		public String getValueDefault() {
			return defaultValue;
		}

		public String getValue() {
			return declValue;
		}

		public String getText() {
			return txt;
		}
	} // Class TestAttributeDecl
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
