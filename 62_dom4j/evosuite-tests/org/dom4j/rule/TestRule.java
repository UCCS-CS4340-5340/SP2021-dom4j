/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.dom.DOMElement;
import org.dom4j.rule.Action;
import org.dom4j.rule.NullAction;
import org.dom4j.rule.Pattern;
import org.dom4j.rule.Rule;
import org.dom4j.rule.pattern.NodeTypePattern;
import org.dom4j.tree.DefaultAttribute;
import org.dom4j.xpath.XPathPattern;
import org.jaxen.pattern.NodeTypeTest;
import org.jaxen.pattern.UnionPattern;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRule {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Rule rule0 = new Rule();
      QName qName0 = QName.get((String) null);
      DOMElement dOMElement0 = new DOMElement(qName0, 0);
      DefaultAttribute defaultAttribute0 = new DefaultAttribute((Element) dOMElement0, qName0, (String) null);
      // Undeclared exception!
      try {
        rule0.matches((Node) defaultAttribute0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Rule rule0 = new Rule();
      String string0 = rule0.toString();
      assertNotNull(string0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      Rule rule0 = new Rule();
      rule0.getMode();
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      Rule rule0 = new Rule();
      NullAction nullAction0 = NullAction.SINGLETON;
      rule0.setAction((Action) nullAction0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_PROCESSING_INSTRUCTION;
      Rule rule0 = new Rule((Pattern) nodeTypePattern0, (Action) null);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      Rule rule0 = new Rule();
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_DOCUMENT;
      rule0.setPattern((Pattern) nodeTypePattern0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      Rule rule0 = new Rule();
      rule0.setMode("=LB");
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      Rule rule0 = new Rule();
      rule0.setAppearenceCount((-1554));
      assertEquals(-1554, rule0.getAppearenceCount());
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      Rule rule0 = new Rule();
      rule0.setPriority((double) (-1554));
      Rule rule1 = new Rule();
      int int0 = rule0.compareTo((Object) rule1);
      assertEquals((-1554.0), rule0.getPriority(), 0.01D);
      assertEquals((-1554), int0);
  }

  @Test
  public void test9()  throws Throwable  {
      Rule rule0 = new Rule();
      int int0 = rule0.getAppearenceCount();
      assertEquals(0, int0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = NodeTypeTest.ELEMENT_TEST;
      UnionPattern unionPattern0 = new UnionPattern((org.jaxen.pattern.Pattern) nodeTypeTest0, (org.jaxen.pattern.Pattern) nodeTypeTest0);
      XPathPattern xPathPattern0 = new XPathPattern((org.jaxen.pattern.Pattern) unionPattern0);
      Rule rule0 = new Rule((Pattern) xPathPattern0);
      Rule[] ruleArray0 = rule0.getUnionRules();
      assertEquals(0.5, rule0.getPriority(), 0.01D);
      assertNotNull(ruleArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = NodeTypeTest.ELEMENT_TEST;
      UnionPattern unionPattern0 = new UnionPattern((org.jaxen.pattern.Pattern) nodeTypeTest0, (org.jaxen.pattern.Pattern) nodeTypeTest0);
      XPathPattern xPathPattern0 = new XPathPattern((org.jaxen.pattern.Pattern) unionPattern0);
      Rule rule0 = new Rule((Pattern) xPathPattern0);
      double double0 = rule0.getPriority();
      assertEquals(0.5, double0, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      Rule rule0 = new Rule();
      // Undeclared exception!
      try {
        rule0.getMatchType();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_PROCESSING_INSTRUCTION;
      Rule rule0 = new Rule((Pattern) nodeTypePattern0);
      rule0.getMatchesNodeName();
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      Rule rule0 = new Rule();
      int int0 = rule0.getImportPrecedence();
      assertEquals(0.5, rule0.getPriority(), 0.01D);
      assertEquals(0, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      Rule rule0 = new Rule();
      boolean boolean0 = rule0.equals((Object) null);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      Rule rule0 = new Rule();
      boolean boolean0 = rule0.equals((Object) rule0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
      assertEquals(true, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      Rule rule0 = new Rule();
      int int0 = rule0.compareTo((Object) "@Ct;?+Yc");
      assertEquals(0.5, rule0.getPriority(), 0.01D);
      assertEquals(5, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      Rule rule0 = new Rule();
      int int0 = rule0.compareTo((Object) rule0);
      assertEquals(0, int0);
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }

  @Test
  public void test19()  throws Throwable  {
      Rule rule0 = new Rule();
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_PROCESSING_INSTRUCTION;
      Rule rule1 = new Rule((Pattern) nodeTypePattern0);
      rule1.setImportPrecedence(1917);
      int int0 = rule0.compareTo(rule1);
      assertEquals(1917, rule1.getImportPrecedence());
      assertEquals((-1917), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_PROCESSING_INSTRUCTION;
      Rule rule0 = new Rule((Pattern) nodeTypePattern0);
      rule0.getUnionRules();
      assertEquals(0.5, rule0.getPriority(), 0.01D);
  }
}
