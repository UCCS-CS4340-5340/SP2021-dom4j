/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.rule.pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.NodeType;
import org.dom4j.bean.BeanElement;
import org.dom4j.dom.DOMCDATA;
import org.dom4j.dom.DOMNamespace;
import org.dom4j.rule.Pattern;
import org.dom4j.rule.pattern.DefaultPattern;
import org.dom4j.util.UserDataElement;
import org.dom4j.xpath.XPathPattern;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDefaultPattern {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("ik\"e1zyj>`vOch12h_");
      DOMCDATA dOMCDATA0 = new DOMCDATA((Element) userDataElement0, "ik\"e1zyj>`vOch12h_");
      XPathPattern xPathPattern0 = (XPathPattern)dOMCDATA0.createPattern("ik\"e1zyj>`vOch12h_");
      DefaultPattern defaultPattern0 = new DefaultPattern((NodeFilter) xPathPattern0);
      String string0 = defaultPattern0.getMatchesNodeName();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultPattern defaultPattern0 = new DefaultPattern((NodeFilter) null);
      Pattern[] patternArray0 = defaultPattern0.getUnionPatterns();
      assertNull(patternArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("ik\"e1zyj>`vOch12h_");
      DOMCDATA dOMCDATA0 = new DOMCDATA((Element) userDataElement0, "ik\"e1zyj>`vOch12h_");
      XPathPattern xPathPattern0 = (XPathPattern)dOMCDATA0.createPattern("ik\"e1zyj>`vOch12h_");
      DefaultPattern defaultPattern0 = new DefaultPattern((NodeFilter) xPathPattern0);
      double double0 = defaultPattern0.getPriority();
      assertEquals(0.5, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("ik\"e1zyj>`vOch12h_");
      DOMCDATA dOMCDATA0 = new DOMCDATA((Element) userDataElement0, "ik\"e1zyj>`vOch12h_");
      XPathPattern xPathPattern0 = (XPathPattern)dOMCDATA0.createPattern("ik\"e1zyj>`vOch12h_");
      DefaultPattern defaultPattern0 = new DefaultPattern((NodeFilter) xPathPattern0);
      NodeType nodeType0 = defaultPattern0.getMatchType();
      assertEquals("ANY_NODE", nodeType0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      BeanElement beanElement0 = new BeanElement("", "text()");
      DOMNamespace dOMNamespace0 = new DOMNamespace((Element) beanElement0, "text()", "");
      XPathPattern xPathPattern0 = (XPathPattern)dOMNamespace0.createPattern("text()");
      DefaultPattern defaultPattern0 = new DefaultPattern((NodeFilter) xPathPattern0);
      boolean boolean0 = defaultPattern0.matches((Node) dOMNamespace0);
      assertEquals(false, boolean0);
  }
}
