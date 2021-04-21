package org.dom4j;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.*;

import org.mockito.Mockito;

// New test file added in Sprint 1-2 to test currently-untested methods in dom4j.NodeHelper
public class NodeHelperTest extends AbstractTestCase {
	
	// jm-1
	// Check that nodeAsAttribute correctly returns a node as an Attribute
	@Test
	public void testNodeAsAttribute() {
		Node node;
		node = Mockito.mock(Attribute.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.ATTRIBUTE_NODE);
		assertTrue("Attribute nodes are identified by nodeAsAttribute", NodeHelper.nodeAsAttribute(node).equals((Attribute) node));
	}
	
	// jm-2
	// Check that nodeAsAttribute() returns null when a non-Attribute is passed in
	@Test
	public void testNodeAsAttributeNull() {
		Node node;
		node = Mockito.mock(Attribute.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.COMMENT_NODE);
		assertTrue("Non-Attribute nodes cause nodeAsAttribute to return null", NodeHelper.nodeAsAttribute(node) == null);
	}
	
	// jm-3
	// Check that nodeAsBranch() returns null
	@Test
	public void testNodeAsBranch() {
		Node node;
		node = Mockito.mock(Branch.class);
		Mockito.when(node.getNodeType()).thenReturn((short) 42);
		assertTrue("Non-Branch nodes cause nodeAsBranch to return null", NodeHelper.nodeAsBranch(node) == null);
	}
	
	// jm-4
	// Check that nodeAsDocument() correctly returns a node as a Document
	@Test
	public void testNodeAsDocument() {
		Node node;
		node = Mockito.mock(Document.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.DOCUMENT_NODE);
		assertTrue("Document nodes are identified by nodeAsDocument", NodeHelper.nodeAsDocument(node).equals((Document) node));
	}
	
	// jm-5
	// Check that nodeAsDocument() correctly returns null when a non-Document is passed in
	@Test
	public void testNodeAsDocumentNull() {
		Node node;
		node = Mockito.mock(Document.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.COMMENT_NODE);
		assertTrue("Non-Document nodes cause nodeAsDocument to return null", NodeHelper.nodeAsDocument(node) == null);
	}
	
	// jm-6
	// Check that nodeAsProcessingInstruction() correctly returns a node as a ProcessingInstruction
	@Test
	public void testNodeAsProcessingInstruction() {
		Node node;
		node = Mockito.mock(ProcessingInstruction.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.PROCESSING_INSTRUCTION_NODE);
		assertTrue("Processing instruction nodes are identified by nodeAsProcessingInstruction", NodeHelper.nodeAsProcessingInstruction(node).equals((ProcessingInstruction) node));
	}
	
	// jm-7
	// Check that nodeAsProcessingInstruction() correctly returns null if not passed a ProcessingInstruction
	@Test
	public void testNodeAsProcessingInstructionNull() {
		Node node;
		node = Mockito.mock(ProcessingInstruction.class);
		Mockito.when(node.getNodeTypeEnum()).thenReturn(NodeType.DOCUMENT_FRAGMENT_NODE);
		assertTrue("nodeAsProcessingInstruction returns null when node is not a ProcessingInstruction", NodeHelper.nodeAsProcessingInstruction(node) == null);
	}
}
