/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sun.msv.datatype.xsd.XSDatatype;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import org.dom4j.Branch;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.datatype.DatatypeElement;
import org.dom4j.dom.DOMElement;
import org.dom4j.dom.DOMNamespace;
import org.dom4j.swing.BranchTreeNode;
import org.dom4j.swing.LeafTreeNode;
import org.dom4j.tree.DefaultElement;
import org.dom4j.util.NonLazyElement;
import org.dom4j.util.UserDataElement;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestBranchTreeNode {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BranchTreeNode branchTreeNode0 = new BranchTreeNode();
      Enumeration<Object> enumeration0 = branchTreeNode0.children();
      assertNotNull(enumeration0);
  }

  @Test
  public void test1()  throws Throwable  {
      QName qName0 = new QName("6 7aD");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0);
      LeafTreeNode leafTreeNode0 = new LeafTreeNode((Node) nonLazyElement0);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) leafTreeNode0, (Branch) nonLazyElement0);
      String string0 = branchTreeNode0.toString();
      assertEquals("6 7aD", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      QName qName0 = new QName("H/v\"2lN;??7\"?@\"pR@", (Namespace) null);
      DatatypeElement datatypeElement0 = new DatatypeElement(qName0, (-444), (XSDatatype) null);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((Branch) datatypeElement0);
      branchTreeNode0.getChildCount();
      assertEquals("org.dom4j.datatype.DatatypeElement766472939 [Element: <H/v\"2lN;??7\"?@\"pR@ attributes: [] data: null />]", datatypeElement0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      BranchTreeNode branchTreeNode0 = new BranchTreeNode();
      boolean boolean0 = branchTreeNode0.getAllowsChildren();
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      QName qName0 = new QName("6 7aD");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0);
      DefaultElement defaultElement0 = (DefaultElement)nonLazyElement0.addElement("6 7aD", "6 7aD", "6 7aD");
      LeafTreeNode leafTreeNode0 = new LeafTreeNode((Node) defaultElement0);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) leafTreeNode0, (Branch) nonLazyElement0);
      boolean boolean0 = branchTreeNode0.isLeaf();
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      QName qName0 = new QName("H/v\"2lN;??7\"?@\"pR@", (Namespace) null);
      DatatypeElement datatypeElement0 = new DatatypeElement(qName0, (-444), (XSDatatype) null);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((Branch) datatypeElement0);
      boolean boolean0 = branchTreeNode0.isLeaf();
      assertEquals("org.dom4j.datatype.DatatypeElement135862873 [Element: <H/v\"2lN;??7\"?@\"pR@ attributes: [] data: null />]", datatypeElement0.toString());
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      QName qName0 = new QName("6 7aD");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0);
      LeafTreeNode leafTreeNode0 = new LeafTreeNode((Node) nonLazyElement0);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) leafTreeNode0, (Branch) nonLazyElement0);
      List<Object> list0 = branchTreeNode0.getChildList();
      List<Object> list1 = branchTreeNode0.getChildList();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test
  public void test7()  throws Throwable  {
      DOMNamespace dOMNamespace0 = new DOMNamespace((String) null, (String) null);
      DOMElement dOMElement0 = new DOMElement((String) null, (Namespace) dOMNamespace0);
      DOMElement dOMElement1 = (DOMElement)dOMElement0.addCDATA((String) null);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((Branch) dOMElement1);
      // Undeclared exception!
      try {
        branchTreeNode0.getChildAt(1263);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 1263, Size: 0
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      QName qName0 = new QName("6 7aD");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0);
      DefaultElement defaultElement0 = (DefaultElement)nonLazyElement0.addElement("6 7aD", "6 7aD", "6 7aD");
      LeafTreeNode leafTreeNode0 = new LeafTreeNode((Node) defaultElement0);
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) leafTreeNode0, (Branch) nonLazyElement0);
      List<Object> list0 = branchTreeNode0.getChildList();
      assertEquals(1, list0.size());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode((Object) "", false);
      UserDataElement userDataElement0 = new UserDataElement("");
      UserDataElement userDataElement1 = (UserDataElement)userDataElement0.addText("");
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) defaultMutableTreeNode0, (Branch) userDataElement1);
      List<Object> list0 = branchTreeNode0.createChildList();
      assertNotNull(list0);
      assertEquals(0, branchTreeNode0.getChildCount());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode((Object) "v!_b", false);
      UserDataElement userDataElement0 = new UserDataElement("v!_b");
      userDataElement0.addText("v!_b");
      BranchTreeNode branchTreeNode0 = new BranchTreeNode((TreeNode) defaultMutableTreeNode0, (Branch) userDataElement0);
      int int0 = branchTreeNode0.getIndex((TreeNode) defaultMutableTreeNode0);
      assertEquals((-1), int0);
  }
}
