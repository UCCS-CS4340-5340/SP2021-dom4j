/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Set;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.HTMLWriter;
import org.dom4j.io.OutputFormat;
import org.dom4j.tree.FlyweightEntity;
import org.dom4j.tree.FlyweightText;
import org.dom4j.util.NonLazyElement;
import org.dom4j.util.UserDataElement;
import org.junit.BeforeClass;
import org.xml.sax.SAXException;

@RunWith(EvoSuiteRunner.class)
public class HTMLWriterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter((Writer) null);
      hTMLWriter0.writeDeclaration();
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0);
      HTMLWriter hTMLWriter0 = new HTMLWriter((OutputStream) printStream0);
      hTMLWriter0.endCDATA();
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test2()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      NonLazyElement nonLazyElement0 = new NonLazyElement("");
      hTMLWriter0.writeElement((Element) nonLazyElement0);
      assertEquals("", nonLazyElement0.getNamespaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      try {
        HTMLWriter.prettyPrintHTML("");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.getOmitElementCloseSet();
      hTMLWriter0.writeClose("P");
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test5()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.startCDATA();
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test6()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) pipedOutputStream0);
      HTMLWriter hTMLWriter0 = new HTMLWriter((OutputStream) printStream0);
      FlyweightEntity flyweightEntity0 = new FlyweightEntity("w&A|j_I1SvlFisnV=$");
      // Undeclared exception!
      try {
        hTMLWriter0.writeEntity((Entity) flyweightEntity0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      Set<String> set0 = hTMLWriter0.getPreformattedTags();
      hTMLWriter0.setPreformattedTags(set0);
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test8()  throws Throwable  {
      try {
        HTMLWriter.prettyPrintXHTML("cvc-complex-type.2.4.a");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line 1 of document  : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      HTMLWriter hTMLWriter0 = new HTMLWriter((OutputStream) byteArrayOutputStream0, outputFormat0);
      FlyweightText flyweightText0 = new FlyweightText("");
      hTMLWriter0.write((Text) flyweightText0);
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test10()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.writeCDATA("P");
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(true);
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      hTMLWriter0.writeCDATA("SpaceRequiredInPI");
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("\n");
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      hTMLWriter0.writeString("\n");
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test13()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.writeClose("P");
      assertEquals(true, hTMLWriter0.resolveEntityRefs());
  }

  @Test
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("\n");
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      hTMLWriter0.endElement("\n", "\n", "\n");
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(true);
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      UserDataElement userDataElement0 = new UserDataElement("SpaceRequiredInPI");
      hTMLWriter0.write((Element) userDataElement0);
      assertEquals("/SpaceRequiredInPI", userDataElement0.getUniquePath());
  }

  @Test
  public void test16()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.writeEmptyElementClose("P");
      assertEquals(true, hTMLWriter0.isEscapeText());
  }

  @Test
  public void test17()  throws Throwable  {
      HTMLWriter hTMLWriter0 = new HTMLWriter();
      hTMLWriter0.setOmitElementCloseSet((Set<String>) null);
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      Set<String> set0 = hTMLWriter0.getPreformattedTags();
      hTMLWriter0.setOmitElementCloseSet(set0);
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w&A|j_I1slisnV=$");
      HTMLWriter hTMLWriter0 = new HTMLWriter((Writer) null, outputFormat0);
      hTMLWriter0.setPreformattedTags((Set<String>) null);
      assertEquals(-1, hTMLWriter0.getMaximumAllowedCharacter());
  }

  @Test
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      HTMLWriter hTMLWriter0 = new HTMLWriter(outputFormat0);
      outputFormat0.setNewLineAfterNTags(780);
      UserDataElement userDataElement0 = new UserDataElement("SpaceRequiredInPI");
      hTMLWriter0.write((Element) userDataElement0);
      hTMLWriter0.write((Node) userDataElement0);
      assertEquals(false, userDataElement0.isRootElement());
  }
}
