/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.List;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentType;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.bean.BeanMetaData;
import org.dom4j.dom.DOMEntityReference;
import org.dom4j.tree.AbstractBranch;
import org.dom4j.tree.ContentListFacade;
import org.dom4j.tree.DefaultDocument;
import org.dom4j.tree.DefaultDocumentType;
import org.dom4j.tree.FlyweightEntity;
import org.dom4j.util.UserDataElement;
import org.junit.BeforeClass;
import org.xml.sax.AttributeList;

@RunWith(EvoSuiteRunner.class)
public class TestContentListFacade {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("C");
      List<?> list0 = userDataElement0.selectNodes("C", "C", false);
      ContentListFacade<UserDataElement> contentListFacade0 = new ContentListFacade<UserDataElement>((AbstractBranch) userDataElement0, list0);
      int int0 = contentListFacade0.indexOf(userDataElement0);
      assertEquals((-1), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("");
      ContentListFacade<Node> contentListFacade0 = new ContentListFacade<Node>((AbstractBranch) userDataElement0, (List<Node>) null);
      // Undeclared exception!
      try {
        contentListFacade0.toArray();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      UserDataElement userDataElement0 = new UserDataElement("C");
      List<?> list0 = userDataElement0.selectNodes("C", "C", false);
      ContentListFacade<DefaultDocument> contentListFacade0 = new ContentListFacade<DefaultDocument>((AbstractBranch) userDataElement0, list0);
      boolean boolean0 = contentListFacade0.remove(defaultDocument0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<Node> contentListFacade0 = new ContentListFacade<Node>((AbstractBranch) defaultDocument0, list0);
      boolean boolean0 = contentListFacade0.containsAll((Collection<?>) list0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<Node> contentListFacade0 = new ContentListFacade<Node>((AbstractBranch) defaultDocument0, list0);
      boolean boolean0 = contentListFacade0.addAll((Collection<?>) contentListFacade0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      UserDataElement userDataElement0 = new UserDataElement("C");
      List<?> list0 = userDataElement0.selectNodes("C", "C", false);
      ContentListFacade<DefaultDocument> contentListFacade0 = new ContentListFacade<DefaultDocument>((AbstractBranch) userDataElement0, list0);
      boolean boolean0 = contentListFacade0.contains(defaultDocument0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<DOMEntityReference> contentListFacade0 = new ContentListFacade<DOMEntityReference>((AbstractBranch) defaultDocument0, list0);
      boolean boolean0 = contentListFacade0.isEmpty();
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      UserDataElement userDataElement0 = new UserDataElement("C");
      List<?> list0 = userDataElement0.selectNodes("C", "C", false);
      ContentListFacade<FlyweightEntity> contentListFacade0 = new ContentListFacade<FlyweightEntity>((AbstractBranch) defaultDocument0, list0);
      List<FlyweightEntity> list1 = contentListFacade0.getBackingList();
      assertEquals(0, list1.size());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      QName qName0 = defaultDocumentFactory0.createQName("");
      BeanElement beanElement0 = new BeanElement(qName0, (Object) defaultDocument0);
      Class<?> class0 = AttributeList.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0, beanMetaData0);
      ContentListFacade<DOMEntityReference> contentListFacade0 = new ContentListFacade<DOMEntityReference>((AbstractBranch) defaultDocument0, (List<DOMEntityReference>) beanAttributeList0);
      contentListFacade0.clear();
      assertEquals(4, contentListFacade0.size());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument();
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      QName qName0 = defaultDocumentFactory0.createQName("");
      BeanElement beanElement0 = new BeanElement(qName0, (Object) defaultDocument0);
      Class<?> class0 = AttributeList.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0, beanMetaData0);
      ContentListFacade<DefaultDocumentType> contentListFacade0 = new ContentListFacade<DefaultDocumentType>((AbstractBranch) defaultDocument0, (List<DefaultDocumentType>) beanAttributeList0);
      // Undeclared exception!
      try {
        contentListFacade0.set(0, defaultDocumentType0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * set(int,Object) unsupported
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<DOMEntityReference> contentListFacade0 = new ContentListFacade<DOMEntityReference>((AbstractBranch) defaultDocument0, list0);
      int int0 = contentListFacade0.lastIndexOf(dOMEntityReference0);
      assertEquals((-1), int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Class<?> class0 = ContentListFacade.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      QName qName0 = defaultDocumentFactory0.createQName("Bvr'4t169>QY,y8y]f2", "Bvr'4t169>QY,y8y]f2");
      BeanElement beanElement0 = new BeanElement(qName0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      ContentListFacade<DefaultDocumentType> contentListFacade0 = new ContentListFacade<DefaultDocumentType>((AbstractBranch) beanElement0, (List<DefaultDocumentType>) beanAttributeList0);
      // Undeclared exception!
      try {
        contentListFacade0.addAll(508, (Collection<?>) beanAttributeList0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * add(int,Object) unsupported
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<DOMEntityReference> contentListFacade0 = new ContentListFacade<DOMEntityReference>((AbstractBranch) defaultDocument0, list0);
      // Undeclared exception!
      try {
        contentListFacade0.add(dOMEntityReference0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<FlyweightEntity> contentListFacade0 = new ContentListFacade<FlyweightEntity>((AbstractBranch) defaultDocument0, list0);
      Node[] nodeArray0 = new Node[5];
      Node[] nodeArray1 = contentListFacade0.toArray(nodeArray0);
      assertSame(nodeArray1, nodeArray0);
  }

  @Test
  public void test14()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<Node> contentListFacade0 = new ContentListFacade<Node>((AbstractBranch) defaultDocument0, list0);
      boolean boolean0 = contentListFacade0.addAll((-1), list0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType();
      DefaultDocument defaultDocument0 = new DefaultDocument((DocumentType) defaultDocumentType0);
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("C");
      List<?> list0 = dOMEntityReference0.selectNodes("C");
      ContentListFacade<Node> contentListFacade0 = new ContentListFacade<Node>((AbstractBranch) defaultDocument0, list0);
      ContentListFacade<FlyweightEntity> contentListFacade1 = new ContentListFacade<FlyweightEntity>((AbstractBranch) defaultDocument0, list0);
      boolean boolean0 = contentListFacade0.removeAll((Collection<?>) contentListFacade1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      Class<?> class0 = ContentListFacade.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList((BeanElement) null, beanMetaData0);
      ContentListFacade<UserDataElement> contentListFacade0 = new ContentListFacade<UserDataElement>((AbstractBranch) null, (List<UserDataElement>) beanAttributeList0);
      // Undeclared exception!
      try {
        contentListFacade0.removeAll((Collection<?>) beanAttributeList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
