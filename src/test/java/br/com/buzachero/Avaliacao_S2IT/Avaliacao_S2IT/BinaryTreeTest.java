package br.com.buzachero.Avaliacao_S2IT.Avaliacao_S2IT;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {
	private static BinaryTree binaryTreeNode1 = null;
	private static BinaryTree binaryTreeNode2 = null;
	private static BinaryTree binaryTreeNode3 = null;
	private static BinaryTree binaryTreeNode4 = null;
	private static BinaryTree binaryTreeNode5 = null;
	
	private static BinaryTree uniqueNode = null;
	
	@BeforeClass
	public static void setUp() {
		binaryTreeNode1 = new BinaryTree();
		binaryTreeNode2 = new BinaryTree();
		binaryTreeNode3 = new BinaryTree();
		binaryTreeNode4 = new BinaryTree();
		binaryTreeNode5 = new BinaryTree();
		uniqueNode = new BinaryTree(300, null, null);
		
		binaryTreeNode1.setValor(1);
		binaryTreeNode1.setLeft(null);
		binaryTreeNode1.setRight(binaryTreeNode2);
		
		binaryTreeNode2.setValor(2);
		binaryTreeNode2.setLeft(binaryTreeNode1);
		binaryTreeNode2.setRight(binaryTreeNode3);
		
		binaryTreeNode3.setValor(3);
		binaryTreeNode3.setLeft(binaryTreeNode2);
		binaryTreeNode3.setRight(binaryTreeNode4);
		
		binaryTreeNode4.setValor(4);
		binaryTreeNode4.setLeft(binaryTreeNode3);
		binaryTreeNode4.setRight(binaryTreeNode5);
		
		binaryTreeNode5.setValor(5);
		binaryTreeNode5.setLeft(binaryTreeNode4);
		binaryTreeNode5.setRight(null);		
	}

	@Test
	public void calculateSumAfterNodeNull_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(null));
	}
	
	@Test
	public void calculateSumAfterNode1_ShouldReturn14() {
		assertEquals(14, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode1));
	}
	
	@Test
	public void calculateSumAfterNode2_ShouldReturn12() {
		assertEquals(12, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode2));
	}
	
	@Test
	public void calculateSumAfterNode3_ShouldReturn9() {
		assertEquals(9, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode3));
	}
	
	@Test
	public void calculateSumAfterNode4_ShouldReturn5() {
		assertEquals(5, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode4));
	}
	
	@Test
	public void calculateSumAfterNode5_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode5));
	}
	
	@Test
	public void calculateSumAfterUniqueNode_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(uniqueNode));
	}
}
