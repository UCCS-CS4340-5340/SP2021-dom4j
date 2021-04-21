package org.dom4j.rule;

import org.dom4j.AbstractTestCase;
import org.dom4j.Node;
import org.dom4j.NodeType;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;
import org.mockito.Mockito;


// Simple integration tests for Mode and Rule
public class ModeRuleTest extends AbstractTestCase {
	// jm-27
	// Test that addRule correctly adds a Rule with an element node type and non-null name
	@Test
	public void testAddElementRule() {
		Mode mode = new Mode();
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ELEMENT_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
		assertTrue("addRule adds a Rule with an element node type and non-null name", mode.getRuleSet(rule.getMatchType()).getRuleArray()[0].equals(rule));
	}
	
	// jm-28
	// Test that addRule correctly adds a Rule with an attribute node type and non-null name
	@Test
	public void testAddAttributeRule() {
		Mode mode = new Mode();
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ATTRIBUTE_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
		assertTrue("addRule adds a Rule with an attribute node type and non-null name", mode.getRuleSet(rule.getMatchType()).getRuleArray()[0].equals(rule));
	}
	
	// jm-29
	// Test that removeRule correctly removes an attribute Rule
	@Test
	public void testRemoveAttributeRule() {
		Mode mode = new Mode();
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ATTRIBUTE_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
		mode.removeRule(rule);
		assertTrue("removeRule removes a Rule with an attribute node type", mode.getRuleSet(rule.getMatchType()).getRuleArray().length == 0);
	}
	
	// jm-30
	// Test that removeRule correctly removes an element Rule
	@Test
	public void testRemoveElementRule() {
		Mode mode = new Mode();
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ELEMENT_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
		mode.removeRule(rule);
		assertTrue("removeRule removes a Rule with an element node type", mode.getRuleSet(rule.getMatchType()).getRuleArray().length == 0);
	}
	
	// jm-31
	// Test that getMatchingRule correctly retrieves a rule for an element Node
	@Test
	public void testGetMatchingElementRule() {
		Mode mode = new Mode();
		
		Node node = Mockito.mock(Node.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.ELEMENT_NODE);
		Mockito.when(node.getName()).thenReturn(".");
		
		
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ELEMENT_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		Mockito.when(pattern.matches(node)).thenReturn(true);
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
	
		assertTrue("getMatchingRule retrieves a rule for an element Node", mode.getMatchingRule(node).equals(rule));
	}
	
	// jm-32
	// Test that getMatchingRule correctly retrieves a rule for an attribute Node
	@Test
	public void testGetMatchingAttributeRule() {
		Mode mode = new Mode();
		
		Node node = Mockito.mock(Node.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.ATTRIBUTE_NODE);
		Mockito.when(node.getName()).thenReturn(".");
		
		
		Pattern pattern = Mockito.mock(Pattern.class);
		Mockito.when(pattern.getMatchType()).thenReturn(NodeType.ATTRIBUTE_NODE);
		Mockito.when(pattern.getMatchesNodeName()).thenReturn(".");
		Mockito.when(pattern.matches(node)).thenReturn(true);
		
		Rule rule = new Rule(pattern);
		mode.addRule(rule);
	
		assertTrue("getMatchingRule retrieves a rule for an attribute Node", mode.getMatchingRule(node).equals(rule));
	}

}
