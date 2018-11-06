package br.com.buzachero;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinaryTreeTest 
{
	private static BinaryTree rootBinaryTreeNodeA = null;
	private static BinaryTree binaryTreeNode2 = null;
	private static BinaryTree binaryTreeNode3 = null;
	private static BinaryTree binaryTreeNode4 = null;
	private static BinaryTree binaryTreeNode5 = null;
	private static BinaryTree binaryTreeNode6 = null;
	private static BinaryTree binaryTreeNode7 = null;	
	
	
	private static BinaryTree rootBinaryTreeNodeB = null;
	private static BinaryTree binaryTreeNode20 = null;
	private static BinaryTree binaryTreeNode30 = null;
	private static BinaryTree binaryTreeNode40 = null;
	private static BinaryTree binaryTreeNode50 = null;
	private static BinaryTree binaryTreeNode60 = null;
	private static BinaryTree binaryTreeNode70 = null;
	private static BinaryTree binaryTreeNode80 = null;
	private static BinaryTree binaryTreeNode90 = null;
	private static BinaryTree binaryTreeNode100 = null;
	private static BinaryTree binaryTreeNode200 = null;
	
	private static BinaryTree uniqueNode = null;
	
	@BeforeClass
	public static void initBinaryTree() {
		createBinaryTrees();
	}

	/*
	 * TEST CASES FOR BINARY TREE A
	 */

	@Test
	public void calculateSumBinaryTreeA_AfterNodeNull_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(null));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode1_ShouldReturn27() {		
		assertEquals(27, BinaryTree.calculateSumOfSubsequentNodes(rootBinaryTreeNodeA));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode2_ShouldReturn9() {
		createBinaryTrees();
		assertEquals(9, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode2));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode3_ShouldReturn13() {
		createBinaryTrees();
		assertEquals(13, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode3));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode4_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode4));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode5_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode5));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode6_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode6));
	}
	
	@Test
	public void calculateSumBinaryTreeA_AfterNode7_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode7));
	}
	
	/*
	 * TEST CASES FOR BINARY TREE B
	 */
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode40_ShouldReturn80() {
		assertEquals(80, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode40));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode80_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode80));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode50_ShouldReturn90() {
		assertEquals(90, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode50));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode90_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode90));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode20_ShouldReturn260() {
		assertEquals(260, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode20));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode60_ShouldReturn100() {
		assertEquals(100, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode60));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode100_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode100));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode70_ShouldReturn200() {
		assertEquals(200, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode70));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode200_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode200));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode30_ShouldReturn430() {
		assertEquals(430, BinaryTree.calculateSumOfSubsequentNodes(binaryTreeNode30));
	}
	
	@Test
	public void calculateSumBinaryTreeB_AfterNode10_ShouldReturn430() {
		assertEquals(740, BinaryTree.calculateSumOfSubsequentNodes(rootBinaryTreeNodeB));
	}
	
	/*
	 * TEST CASE FOR BINARY TREE WITH UNIQUE NODE
	 */		
	@Test
	public void calculateSumAfterUniqueNode_ShouldReturn0() {
		assertEquals(0, BinaryTree.calculateSumOfSubsequentNodes(uniqueNode));
	}
	
	private static void createBinaryTrees() {

		/*
		 * INITIALIZING BinaryTree A
		 */
		rootBinaryTreeNodeA = new BinaryTree();
		binaryTreeNode2 = new BinaryTree();
		binaryTreeNode3 = new BinaryTree();
		binaryTreeNode4 = new BinaryTree();
		binaryTreeNode5 = new BinaryTree();
		binaryTreeNode6 = new BinaryTree();
		binaryTreeNode7 = new BinaryTree();
		
		
		rootBinaryTreeNodeA.setValor(1);
		rootBinaryTreeNodeA.setLeft(binaryTreeNode2);
		rootBinaryTreeNodeA.setRight(binaryTreeNode3);
		
		binaryTreeNode2.setValor(2);
		binaryTreeNode2.setLeft(binaryTreeNode4);
		binaryTreeNode2.setRight(binaryTreeNode5);
		
		binaryTreeNode3.setValor(3);
		binaryTreeNode3.setLeft(binaryTreeNode6);
		binaryTreeNode3.setRight(binaryTreeNode7);
		
		binaryTreeNode4.setValor(4);
		binaryTreeNode4.setLeft(null);
		binaryTreeNode4.setRight(null);
		
		binaryTreeNode5.setValor(5);
		binaryTreeNode5.setLeft(null);
		binaryTreeNode5.setRight(null);
		
		binaryTreeNode6.setValor(6);
		binaryTreeNode6.setLeft(null);
		binaryTreeNode6.setRight(null);
		
		binaryTreeNode7.setValor(7);
		binaryTreeNode7.setLeft(null);
		binaryTreeNode7.setRight(null);
		
		/*
		 * INITIALIZING BinaryTree B
		 */
				
		rootBinaryTreeNodeB = new BinaryTree();
		binaryTreeNode20 = new BinaryTree();
		binaryTreeNode30 = new BinaryTree();
		binaryTreeNode40 = new BinaryTree();
		binaryTreeNode50 = new BinaryTree();
		binaryTreeNode60 = new BinaryTree();
		binaryTreeNode70 = new BinaryTree();
		binaryTreeNode80 = new BinaryTree();
		binaryTreeNode90 = new BinaryTree();
		binaryTreeNode100 = new BinaryTree();
		binaryTreeNode200 = new BinaryTree();
		
		rootBinaryTreeNodeB.setValor(10);
		rootBinaryTreeNodeB.setLeft(binaryTreeNode20);
		rootBinaryTreeNodeB.setRight(binaryTreeNode30);
		
		binaryTreeNode20.setValor(20);
		binaryTreeNode20.setLeft(binaryTreeNode40);
		binaryTreeNode20.setRight(binaryTreeNode50);
		
		binaryTreeNode30.setValor(30);
		binaryTreeNode30.setLeft(binaryTreeNode60);
		binaryTreeNode30.setRight(binaryTreeNode70);
		
		binaryTreeNode40.setValor(40);
		binaryTreeNode40.setLeft(binaryTreeNode80);
		binaryTreeNode40.setRight(null);
		
		binaryTreeNode50.setValor(50);
		binaryTreeNode50.setLeft(null);
		binaryTreeNode50.setRight(binaryTreeNode90);
		
		binaryTreeNode60.setValor(60);
		binaryTreeNode60.setLeft(null);
		binaryTreeNode60.setRight(binaryTreeNode100);
		
		binaryTreeNode70.setValor(70);
		binaryTreeNode70.setLeft(binaryTreeNode200);
		binaryTreeNode70.setRight(null);
		
		binaryTreeNode80.setValor(80);
		binaryTreeNode80.setLeft(null);
		binaryTreeNode80.setRight(null);
		
		binaryTreeNode90.setValor(90);
		binaryTreeNode90.setLeft(null);
		binaryTreeNode90.setRight(null);
		
		binaryTreeNode100.setValor(100);
		binaryTreeNode100.setLeft(null);
		binaryTreeNode100.setRight(null);
		
		binaryTreeNode200.setValor(200);
		binaryTreeNode200.setLeft(null);
		binaryTreeNode200.setRight(null);
		
		/*
		 * INITIALIZING BinaryTree WITH UNIQUE NODE
		 */				
		
		uniqueNode = new BinaryTree(300, null, null);
	}
}