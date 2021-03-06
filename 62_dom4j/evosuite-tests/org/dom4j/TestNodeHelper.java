/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.NodeHelper;
import org.dom4j.NodeType;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.bean.BeanElement;
import org.dom4j.dom.DOMAttribute;
import org.dom4j.dom.DOMElement;
import org.dom4j.dom.DOMProcessingInstruction;
import org.dom4j.tree.AbstractBranch;
import org.dom4j.tree.BackedList;
import org.dom4j.tree.DefaultDocument;
import org.dom4j.tree.FlyweightAttribute;
import org.dom4j.util.IndexedElement;
import org.dom4j.util.NonLazyElement;
import org.dom4j.util.UserDataElement;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestNodeHelper {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      Attribute attribute0 = NodeHelper.nodeAsAttribute((Node) defaultDocument0);
      assertNull(attribute0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      QName qName0 = defaultDocumentFactory0.createQName("I04i9D|>U", "I04i9D|>U", "I04i9D|>U");
      DOMAttribute dOMAttribute0 = new DOMAttribute(qName0, "I04i9D|>U");
      DOMAttribute dOMAttribute1 = (DOMAttribute)NodeHelper.nodeAsAttribute((Node) dOMAttribute0);
      assertEquals("I04i9D|>U:I04i9D|>U=\"I04i9D|>U\"", dOMAttribute1.asXML());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      DefaultDocument defaultDocument1 = (DefaultDocument)NodeHelper.nodeAsBranch((Node) defaultDocument0);
      assertNull(defaultDocument1);
  }

  @Test
  public void test3()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement(" cannot be greater than ");
      Document document0 = NodeHelper.nodeAsDocument((Node) userDataElement0);
      assertNull(document0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      DefaultDocument defaultDocument1 = (DefaultDocument)NodeHelper.nodeAsDocument((Node) defaultDocument0);
      assertEquals(NodeType.DOCUMENT_NODE, defaultDocument1.getNodeTypeEnum());
  }

  @Test
  public void test5()  throws Throwable  {
      Namespace namespace0 = Namespace.get(";}j8!W+q}* e @", ";}j8!W+q}* e @");
      QName qName0 = new QName(";}j8!W+q}* e @", namespace0, ";}j8!W+q}* e @");
      BackedList<Element> backedList0 = NodeHelper.appendElementQNamedLocal((Node) namespace0, (BackedList<Element>) null, qName0);
      assertNull(backedList0);
  }

  @Test
  public void test6()  throws Throwable  {
      DOMElement dOMElement0 = new DOMElement("{evB-HoPxqPl");
      BackedList<Element> backedList0 = NodeHelper.appendElementNamedLocal((Node) dOMElement0, (BackedList<Element>) null, "=ca~s");
      assertNull(backedList0);
  }

  @Test
  public void test7()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement(" cannot be greater than ");
      Namespace namespace0 = NodeHelper.nodeAsNamespace((Node) userDataElement0);
      assertNull(namespace0);
  }

  @Test
  public void test8()  throws Throwable  {
      Namespace namespace0 = Namespace.get("%KGJxN%qn`Yv@jE3#", "%KGJxN%qn`Yv@jE3#");
      Namespace namespace1 = NodeHelper.nodeAsNamespace((Node) namespace0);
      assertEquals("Namespace", namespace1.getNodeTypeName());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      ProcessingInstruction processingInstruction0 = NodeHelper.nodeAsProcessingInstruction((Node) defaultDocument0);
      assertNull(processingInstruction0);
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      QName qName0 = defaultDocumentFactory0.createQName("H#SIM}g6>Y7rj[Fk", "H#SIM}g6>Y7rj[Fk", "H#SIM}g6>Y7rj[Fk");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0, 434);
      DOMProcessingInstruction dOMProcessingInstruction0 = new DOMProcessingInstruction((Element) nonLazyElement0, "H#SIM}g6>Y7rj[Fk", "H#SIM}g6>Y7rj[Fk");
      DOMProcessingInstruction dOMProcessingInstruction1 = (DOMProcessingInstruction)NodeHelper.nodeAsProcessingInstruction((Node) dOMProcessingInstruction0);
      assertSame(dOMProcessingInstruction1, dOMProcessingInstruction0);
  }

  @Test
  public void test11()  throws Throwable  {
      Namespace namespace0 = Namespace.get("wds)A64\">v''VjLui", "wds)A64\">v''VjLui");
      UserDataElement userDataElement0 = new UserDataElement("wds)A64\">v''VjLui");
      BackedList<Element> backedList0 = new BackedList<Element>((AbstractBranch) userDataElement0, (List<Node>) null);
      BackedList<Element> backedList1 = NodeHelper.appendElementLocal((Node) namespace0, backedList0);
      assertNotNull(backedList1);
      assertEquals(0, backedList0.size());
      assertEquals("[]", backedList1.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement(" cannot be greater than ");
      IndexedElement indexedElement0 = new IndexedElement(" cannot be greater than ");
      List<Node> list0 = indexedElement0.content();
      BackedList<Element> backedList0 = new BackedList<Element>((AbstractBranch) userDataElement0, list0);
      BackedList<Element> backedList1 = NodeHelper.appendElementLocal((Node) userDataElement0, backedList0);
      assertEquals(1, backedList0.size());
      assertEquals(false, backedList1.isEmpty());
  }

  @Test
  public void test13()  throws Throwable  {
      Namespace namespace0 = Namespace.get("wds)A64\">v''VjLui", "wds)A64\">v''VjLui");
      UserDataElement userDataElement0 = new UserDataElement("wds)A64\">v''VjLui");
      BackedList<Element> backedList0 = new BackedList<Element>((AbstractBranch) userDataElement0, (List<Node>) null);
      BackedList<Element> backedList1 = NodeHelper.appendElementNamedLocal((Node) namespace0, backedList0, "wds)A64\">v''VjLui");
      assertSame(backedList0, backedList1);
  }

  @Test
  public void test14()  throws Throwable  {
      Namespace namespace0 = Namespace.get("wds)A64\">v''VjLui", "wds)A64\">v''VjLui");
      DOMElement dOMElement0 = new DOMElement("wds)A64\">v''VjLui", namespace0);
      UserDataElement userDataElement0 = new UserDataElement("wds)A64\">v''VjLui");
      BackedList<Element> backedList0 = new BackedList<Element>((AbstractBranch) userDataElement0, (List<Node>) null);
      NodeHelper.appendElementNamedLocal((Node) dOMElement0, backedList0, "wds)A64\">v''VjLui");
      assertEquals(1, backedList0.size());
      assertEquals(false, backedList0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      Namespace namespace0 = Namespace.get(";}j8!W+q}* e @", ";}j8!W+q}* e @");
      QName qName0 = new QName(";}j8!W+q}* e @", namespace0, ";}j8!W+q}* e @");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0);
      // Undeclared exception!
      try {
        NodeHelper.appendElementQNamedLocal((Node) nonLazyElement0, (BackedList<Element>) null, qName0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement(" cannot be greater than ");
      BeanElement beanElement0 = new BeanElement(" cannot be greater than ", " cannot be greater than ");
      BeanElement beanElement1 = (BeanElement)beanElement0.addElement(" cannot be greater than ", " cannot be greater than ", " cannot be greater than ");
      IndexedElement indexedElement0 = new IndexedElement(" cannot be greater than ");
      List<Node> list0 = indexedElement0.content();
      BackedList<Element> backedList0 = new BackedList<Element>((AbstractBranch) userDataElement0, list0);
      QName qName0 = userDataElement0.getQName();
      BackedList<Element> backedList1 = NodeHelper.appendElementQNamedLocal((Node) beanElement1, backedList0, qName0);
      assertNotNull(backedList1);
      assertEquals(0, backedList1.size());
  }

  @Test
  public void test17()  throws Throwable  {
      FlyweightAttribute flyweightAttribute0 = new FlyweightAttribute("VmI]yP5%#u", "VmI]yP5%#u");
      String string0 = NodeHelper.getAttributeValue((Attribute) flyweightAttribute0, "VmI]yP5%#u");
      assertEquals("VmI]yP5%#u", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = NodeHelper.getAttributeValue((Attribute) null, " cannot be greater than ");
      assertEquals(" cannot be greater than ", string0);
  }
}
