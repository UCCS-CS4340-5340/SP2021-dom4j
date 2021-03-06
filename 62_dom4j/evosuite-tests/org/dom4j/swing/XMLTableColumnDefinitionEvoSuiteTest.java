/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.InvalidXPathException;
import org.dom4j.XPath;
import org.dom4j.dom.DOMDocumentType;
import org.dom4j.swing.XMLTableColumnDefinition;
import org.dom4j.xpath.DefaultXPath;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XMLTableColumnDefinitionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      xMLTableColumnDefinition0.handleException((Exception) null);
      assertNull(xMLTableColumnDefinition0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      int int0 = xMLTableColumnDefinition0.getType();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      xMLTableColumnDefinition0.setType(1);
      // Undeclared exception!
      try {
        xMLTableColumnDefinition0.getValue((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType("TEXT_NODE", "TEXT_NODE");
      DefaultXPath defaultXPath0 = (DefaultXPath)dOMDocumentType0.createXPath("TEXT_NODE");
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("TEXT_NODE", (XPath) defaultXPath0, 0);
      xMLTableColumnDefinition0.setColumnNameXPath((XPath) defaultXPath0);
      assertEquals(0, xMLTableColumnDefinition0.getType());
  }

  @Test
  public void test4()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      XPath xPath0 = xMLTableColumnDefinition0.getXPath();
      assertNull(xPath0);
  }

  @Test
  public void test5()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition((XPath) null, (XPath) null, 2);
      Class<Object> class0 = xMLTableColumnDefinition0.getColumnClass();
      assertEquals(1025, class0.getModifiers());
  }

  @Test
  public void test6()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      XPath xPath0 = xMLTableColumnDefinition0.getColumnNameXPath();
      assertNull(xPath0);
  }

  @Test
  public void test7()  throws Throwable  {
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType("TEXT_NODE", "TEXT_NODE");
      DefaultXPath defaultXPath0 = (DefaultXPath)dOMDocumentType0.createXPath("TEXT_NODE");
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("TEXT_NODE", (XPath) defaultXPath0, 0);
      xMLTableColumnDefinition0.setXPath((XPath) defaultXPath0);
      assertEquals(0, xMLTableColumnDefinition0.getType());
  }

  @Test
  public void test8()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      String string0 = xMLTableColumnDefinition0.getName();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition();
      xMLTableColumnDefinition0.setName((String) null);
      assertEquals(0, xMLTableColumnDefinition0.getType());
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType((String) null);
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType("number");
      assertEquals(2, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType("");
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType("string");
      assertEquals(1, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType("nodb");
      assertEquals(0, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = XMLTableColumnDefinition.parseType("node");
      assertEquals(3, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("string", "nodb", 1);
      Class<Object> class0 = xMLTableColumnDefinition0.getColumnClass();
      assertEquals("string", xMLTableColumnDefinition0.getName());
      assertEquals(17, class0.getModifiers());
  }

  @Test
  public void test17()  throws Throwable  {
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType("TEXT_NODE", "TEXT_NODE");
      DefaultXPath defaultXPath0 = (DefaultXPath)dOMDocumentType0.createXPath("TEXT_NODE");
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("TEXT_NODE", (XPath) defaultXPath0, 0);
      Class<Object> class0 = xMLTableColumnDefinition0.getColumnClass();
      assertEquals(0, xMLTableColumnDefinition0.getType());
      assertEquals("Object", class0.getSimpleName());
  }

  @Test
  public void test18()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("node", (XPath) null, 3);
      Class<Object> class0 = xMLTableColumnDefinition0.getColumnClass();
      assertEquals(true, class0.isInterface());
  }

  @Test
  public void test19()  throws Throwable  {
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType("TEXT_NODE", "TEXT_NODE");
      DefaultXPath defaultXPath0 = (DefaultXPath)dOMDocumentType0.createXPath("TEXT_NODE");
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("TEXT_NODE", (XPath) defaultXPath0, 0);
      String string0 = (String)xMLTableColumnDefinition0.getValue((Object) "TEXT_NODE");
      assertEquals(0, xMLTableColumnDefinition0.getType());
      assertNotNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition((XPath) null, (XPath) null, 2);
      // Undeclared exception!
      try {
        xMLTableColumnDefinition0.getValue((Object) "PROCESSNG_INSTRUCTION_NOD");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      XMLTableColumnDefinition xMLTableColumnDefinition0 = new XMLTableColumnDefinition("node", "node", 3);
      String string0 = (String)xMLTableColumnDefinition0.getValue((Object) "");
      assertNull(string0);
      assertEquals(3, xMLTableColumnDefinition0.getType());
  }
}
