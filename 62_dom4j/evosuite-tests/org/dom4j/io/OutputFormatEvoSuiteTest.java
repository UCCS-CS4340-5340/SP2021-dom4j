/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.io.OutputFormat;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OutputFormatEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getIndent();
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
  }

  @Test
  public void test1()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(true, boolean0);
      assertEquals(true, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
  }

  @Test
  public void test2()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isPadText();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(true, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(true, boolean0);
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test
  public void test3()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-xh2ml");
      assertEquals(false, outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-xhtml-xh2ml";
      stringArray0[1] = "-lineSeparator";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(" ", true);
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(true, outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      
      outputFormat0.setNewLineAfterNTags(1);
      assertEquals(1, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test
  public void test6()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("5{*9.=KP_% b");
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(true, boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
  }

  @Test
  public void test7()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, int0);
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test
  public void test8()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("IV4/*", false);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
  }

  @Test
  public void test9()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals(true, outputFormat0.isSuppressDeclaration());
      assertEquals(1, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals(false, outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-omitEncoding";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals(false, boolean0);
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isOmitEncoding());
  }

  @Test
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", false, "-indentSize");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-indentSize";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty-&WE>5ZwE9UCc`yq", true);
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[4];
      stringArray0[1] = "-expandEmpty-&WE>5ZwE9UCc`yq";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("5{*9.=KP_% b");
      String string0 = outputFormat0.getLineSeparator();
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals("\n", string0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertNotNull(string0);
      assertEquals(false, outputFormat0.isXHTML());
  }

  @Test
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals('\"', char0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(true, outputFormat0.isNewlines());
      assertEquals(true, outputFormat0.isPadText());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
  }

  @Test
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      assertEquals(false, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, boolean0);
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isOmitEncoding());
  }

  @Test
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, boolean0);
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String string0 = outputFormat0.getEncoding();
      assertNotNull(string0);
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals("UTF-8", string0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(false, outputFormat0.isPadText());
  }

  @Test
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding", true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-encoding";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("-omitEncoding");
      assertEquals("-omitEncoding", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isNewlines());
  }

  @Test
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-indent";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("-omitEncoding");
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(false, outputFormat0.isOmitEncoding());
  }

  @Test
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(" ", true);
      outputFormat0.setIndent("");
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(true, outputFormat0.isNewlines());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(false, outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent(true);
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals(false, outputFormat0.isNewlines());
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(false, outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
  }

  @Test
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("IV4/*", false);
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertEquals(true, outputFormat0.isTrimText());
      assertEquals(false, outputFormat0.isOmitEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals(false, outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(true, outputFormat0.isPadText());
      assertEquals(false, outputFormat0.isExpandEmptyElements());
      assertEquals(true, outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(false, outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(true, outputFormat0.isNewlines());
  }

  @Test
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      // Undeclared exception!
      try {
        outputFormat0.setAttributeQuoteCharacter('J');
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid attribute quote character (J)
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", true);
      assertEquals(false, outputFormat0.isTrimText());
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-trimText";
      // Undeclared exception!
      try {
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * StringEquals is not supposed to work on a null caller
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertEquals(false, outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[4];
      stringArray0[1] = "-xhtml";
      stringArray0[2] = "-xhtml";
      stringArray0[3] = "-padText";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals(true, outputFormat0.isXHTML());
      assertEquals(4, int0);
  }

  @Test
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals(false, outputFormat0.isNewlines());
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "kgjDrxI@Q9x*";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals(true, outputFormat0.isNewlines());
      assertEquals(1, int0);
  }
}
