/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXModifyReader;
import org.dom4j.io.XMLWriter;
import org.junit.BeforeClass;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class TestSAXModifyReader {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader((String) null, true);
      assertEquals(true, sAXModifyReader0.isValidating());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader((DocumentFactory) defaultDocumentFactory0);
      sAXModifyReader0.setPruneElements(false);
      assertEquals(false, sAXModifyReader0.isPruneElements());
  }

  @Test
  public void test2()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader((XMLReader) null, true);
      try {
        sAXModifyReader0.read((String) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader((XMLReader) xMLFilterImpl0);
      OutputFormat outputFormat0 = new OutputFormat("/>]", false);
      XMLWriter xMLWriter0 = new XMLWriter(outputFormat0);
      sAXModifyReader0.setXMLWriter(xMLWriter0);
      assertEquals(false, sAXModifyReader0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test4()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader(false);
      assertEquals(false, sAXModifyReader0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test5()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader();
      boolean boolean0 = sAXModifyReader0.isPruneElements();
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader((DocumentFactory) null, true);
      assertNull(sAXModifyReader0.getEncoding());
  }

  @Test
  public void test7()  throws Throwable  {
      SAXModifyReader sAXModifyReader0 = new SAXModifyReader();
      XMLWriter xMLWriter0 = sAXModifyReader0.getXMLWriter();
      assertNull(xMLWriter0);
  }
}
