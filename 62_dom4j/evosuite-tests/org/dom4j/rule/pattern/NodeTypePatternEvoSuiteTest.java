/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.rule.pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.NodeType;
import org.dom4j.rule.Pattern;
import org.dom4j.rule.pattern.NodeTypePattern;
import org.dom4j.tree.DefaultDocument;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NodeTypePatternEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NodeType nodeType0 = NodeType.ENTITY_REFERENCE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      String string0 = nodeTypePattern0.getMatchesNodeName();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      NodeType nodeType0 = NodeType.ENTITY_REFERENCE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      NodeType nodeType1 = nodeTypePattern0.getMatchType();
      assertEquals(5, nodeType1.ordinal());
  }

  @Test
  public void test2()  throws Throwable  {
      NodeType nodeType0 = NodeType.ENTITY_REFERENCE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      Pattern[] patternArray0 = nodeTypePattern0.getUnionPatterns();
      assertNull(patternArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      NodeType nodeType0 = NodeType.NAMESPACE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      double double0 = nodeTypePattern0.getPriority();
      assertEquals(0.5, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      NodeType nodeType0 = NodeType.NAMESPACE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      DefaultDocument defaultDocument0 = new DefaultDocument(",*NhS(");
      boolean boolean0 = nodeTypePattern0.matches((Node) defaultDocument0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      NodeType nodeType0 = NodeType.NAMESPACE_NODE;
      NodeTypePattern nodeTypePattern0 = new NodeTypePattern(nodeType0);
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      boolean boolean0 = nodeTypePattern0.matches((Node) namespace0);
      assertEquals(true, boolean0);
  }
}
