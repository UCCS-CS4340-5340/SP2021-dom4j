/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.jaxp.SAXParserImpl;
import org.dom4j.io.JAXPHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JAXPHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAXParserImpl.JAXPSAXParser sAXParserImpl_JAXPSAXParser0 = (SAXParserImpl.JAXPSAXParser)JAXPHelper.createXMLReader(false, false);
      assertNotNull(sAXParserImpl_JAXPSAXParser0);
  }

  @Test
  public void test1()  throws Throwable  {
      JAXPHelper jAXPHelper0 = new JAXPHelper();
      assertNotNull(jAXPHelper0);
  }

  @Test
  public void test2()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)JAXPHelper.createDocument(false, true);
      assertEquals(false, documentImpl0.getReadOnly());
  }
}
