/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.dom.DOMCDATA;
import org.dom4j.dom.DOMElement;
import org.dom4j.rule.Action;
import org.dom4j.rule.Pattern;
import org.dom4j.rule.Rule;
import org.dom4j.rule.RuleSet;
import org.dom4j.rule.pattern.NodeTypePattern;
import org.dom4j.xpath.XPathPattern;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestRuleSet {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      ruleSet0.removeRule((Rule) null);
  }

  @Test
  public void test1()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      DOMCDATA dOMCDATA0 = new DOMCDATA("http://apache.org/ml/poperties/internal/namespace-context");
      XPathPattern xPathPattern0 = (XPathPattern)dOMCDATA0.createPattern("http://apache.org/ml/poperties/internal/namespace-context");
      Rule rule0 = new Rule((Pattern) xPathPattern0);
      ruleSet0.addRule(rule0);
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      Rule rule1 = ruleSet0.getMatchingRule((Node) namespace0);
      assertNull(rule1);
  }

  @Test
  public void test2()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      String string0 = ruleSet0.toString();
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      ruleSet0.addAll(ruleSet0);
  }

  @Test
  public void test4()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      NodeTypePattern nodeTypePattern0 = NodeTypePattern.ANY_ELEMENT;
      Rule rule0 = new Rule((Pattern) nodeTypePattern0, (Action) null);
      ruleSet0.addRule(rule0);
      DOMElement dOMElement0 = new DOMElement("=2<0%jfA,");
      Rule rule1 = ruleSet0.getMatchingRule((Node) dOMElement0);
      assertSame(rule1, rule0);
  }

  @Test
  public void test5()  throws Throwable  {
      RuleSet ruleSet0 = new RuleSet();
      ruleSet0.getRuleArray();
      DOMElement dOMElement0 = new DOMElement("=2<0%jfA,");
      Rule rule0 = ruleSet0.getMatchingRule((Node) dOMElement0);
      assertNull(rule0);
  }
}
