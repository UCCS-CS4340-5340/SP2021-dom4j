/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.NodeType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestNodeType {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NodeType nodeType0 = NodeType.byCode((short)7);
      String string0 = nodeType0.getName();
      assertEquals("ProcessingInstruction", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      NodeType nodeType0 = NodeType.byCode((short)7);
      short short0 = nodeType0.getCode();
      assertEquals((short)7, short0);
  }

  @Test
  public void test2()  throws Throwable  {
      NodeType.byCode((short) (-1487));
  }

  @Test
  public void test3()  throws Throwable  {
      NodeType.byCode((short)557);
  }
}