package org.dom4j.xpath;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import org.jaxen.ContextSupport;
import org.jaxen.FunctionContext;
import org.jaxen.Navigator;
import org.jaxen.XPathFunctionContext;
import org.jaxen.dom4j.DocumentNavigator;

public class XPathPatternTest {
	// Added in 2-1
	@Test
	public void testGetContextSupport() {
		XPathPattern pattern = new XPathPattern("test");
		
		FunctionContext functionContext = XPathFunctionContext.getInstance();
		Navigator nav = DocumentNavigator.getInstance();
		
		ContextSupport returnVal = pattern.getContextSupport();
		assertTrue(returnVal.getFunctionContext().equals(functionContext));
		assertTrue(returnVal.getNavigator().equals(nav));
	}

}
