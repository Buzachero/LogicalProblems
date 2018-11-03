package br.com.buzachero.Avaliacao_S2IT.Avaliacao_S2IT;

public class BinaryTree {
	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree() {
		
	}
	
	public BinaryTree(int valor, BinaryTree leftNode, BinaryTree rightNode) {
		this.valor = valor;
		this.left = leftNode;
		this.right = rightNode;
	}
	
	public static int calculateSumOfSubsequentNodes(BinaryTree node) {
		int sumOfSubsequentNodes = 0;
		
		if(node == null) { 
			return 0;
		}	
		
		BinaryTree rightNode = node.right; 
		
		while(rightNode != null) {
			sumOfSubsequentNodes += rightNode.valor;
			rightNode = rightNode.right;
		}
				
		return sumOfSubsequentNodes;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
