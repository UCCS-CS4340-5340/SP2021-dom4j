/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.dom4j.swing.XMLTableDefinition;
import org.dom4j.swing.XMLTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestXMLTableModel {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLTableModel xMLTableModel0 = new XMLTableModel((XMLTableDefinition) null, (Object) "set(int,Object) unsupported");
      // Undeclared exception!
      try {
        xMLTableModel0.getColumnClass(47806);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, xMLTableDefinition0);
      Object object0 = xMLTableModel0.getValueAt(261, 261);
      assertNull(object0);
  }

  @Test
  public void test2()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, (Object) "job-media-sheets-supported");
      xMLTableModel0.setDefinition(xMLTableDefinition0);
      assertEquals(0, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test3()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, xMLTableDefinition0);
      JTable jTable0 = new JTable((TableModel) xMLTableModel0);
      // Undeclared exception!
      try {
        xMLTableModel0.fireTableRowsDeleted(6, 6);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, xMLTableDefinition0);
      XMLTableDefinition xMLTableDefinition1 = (XMLTableDefinition)xMLTableModel0.getSource();
      xMLTableModel0.setSource((Object) xMLTableDefinition1);
      assertSame(xMLTableDefinition1, xMLTableDefinition0);
  }

  @Test
  public void test5()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, (Object) "job-media-sheets-supported");
      XMLTableDefinition xMLTableDefinition1 = xMLTableModel0.getDefinition();
      assertSame(xMLTableDefinition0, xMLTableDefinition1);
  }

  @Test
  public void test6()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, (Object) "rolloverEnabled");
      xMLTableDefinition0.addColumn("rolloverEnabled", "rolloverEnabled");
      JTable jTable0 = new JTable((TableModel) xMLTableModel0);
      assertEquals(1, xMLTableModel0.getColumnCount());
      assertNotNull(jTable0);
  }

  @Test
  public void test7()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableModel xMLTableModel0 = new XMLTableModel(xMLTableDefinition0, (Object) "rolloverEnabled");
      xMLTableDefinition0.addColumnWithXPathName("rolloverEnabled", "rolloverEnabled", 1202);
      JTable jTable0 = new JTable((TableModel) xMLTableModel0);
      assertEquals(1, xMLTableModel0.getColumnCount());
      assertNotNull(jTable0);
  }
}
