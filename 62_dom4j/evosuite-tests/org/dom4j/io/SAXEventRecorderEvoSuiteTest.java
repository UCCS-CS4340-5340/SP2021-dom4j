/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ConcurrentModificationException;
import org.dom4j.io.SAXEventRecorder;
import org.junit.BeforeClass;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;

@RunWith(EvoSuiteRunner.class)
public class SAXEventRecorderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAXEventRecorder.SAXEvent sAXEventRecorder_SAXEvent0 = new SAXEventRecorder.SAXEvent();
      Object object0 = sAXEventRecorder_SAXEvent0.getParm(1822);
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startEntity("e+k+8QG^nl;9ev4");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startCDATA();
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.attributeDecl("", "", "", "", "");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      char[] charArray0 = new char[8];
      sAXEventRecorder0.comment(charArray0, (int) ' ', (int) ' ');
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startPrefixMapping("Unrecognized event: ", "Unrecognized event: ");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      char[] charArray0 = new char[2];
      sAXEventRecorder0.characters(charArray0, (int) '\u0000', 0);
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startDocument();
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endDocument();
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.internalEntityDecl("", "");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endDTD();
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startDTD("e+k+8QG^nl;9ev4", "e+k+8QG^nl;9ev4", "Unrecognized event: ");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endCDATA();
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endPrefixMapping("e+k+8QG^nl;9ev4");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endEntity((String) null);
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
  }

  @Test
  public void test16()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.processingInstruction("", "");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXEventRecorder0.startElement((String) null, "", "7q\"3=D`Z3KX/'4gD%", (Attributes) attributes2Impl0);
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endElement("Unrecognized event: ", "Unrecognized event: ", "Unrecognized event: ");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.elementDecl("", "");
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.externalEntityDecl((String) null, (String) null, (String) null);
      // Undeclared exception!
      try {
        sAXEventRecorder0.replay((ContentHandler) sAXEventRecorder0);
        fail("Expecting exception: ConcurrentModificationException");
      } catch(ConcurrentModificationException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sAXEventRecorder0.startElement(".c,ass", ".c,ass", ".c,ass", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  @Test
  public void test22()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.startElement((String) null, (String) null, (String) null, (Attributes) null);
  }

  @Test
  public void test23()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      sAXEventRecorder0.endElement((String) null, (String) null, (String) null);
  }

  @Test
  public void test24()  throws Throwable  {
      SAXEventRecorder sAXEventRecorder0 = new SAXEventRecorder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0);
      sAXEventRecorder0.elementDecl("'#wN", "'#wN");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      sAXEventRecorder0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(150, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0001sr\u0000\u0013java.util.ArrayListx\uFFFD\uFFFD\u001D\uFFFD\uFFFDa\uFFFD\u0003\u0000\u0001I\u0000\u0004sizexp\u0000\u0000\u0000\u0001w\u0004\u0000\u0000\u0000\nsr\u0000&org.dom4j.io.SAXEventRecorder$SAXEvent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\f\u0000\u0000xpw\u0002\u0010\u0001sq\u0000~\u0000\u0000\u0000\u0000\u0000\u0002w\u0004\u0000\u0000\u0000\u0003t\u0000\u0004'#wNq\u0000~\u0000\u0005xxx", byteArrayOutputStream0.toString());
  }

  @Test
  public void test25()  throws Throwable  {
      SAXEventRecorder.SAXEvent sAXEventRecorder_SAXEvent0 = new SAXEventRecorder.SAXEvent();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (int) '>');
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      sAXEventRecorder_SAXEvent0.writeExternal((ObjectOutput) objectOutputStream0);
  }
}
