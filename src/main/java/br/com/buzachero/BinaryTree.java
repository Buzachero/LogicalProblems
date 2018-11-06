package br.com.buzachero;

/**
 * Hello world!
 *
 */
public class  BinaryTree {
	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree() {
		
	}
	
	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		super();
		this.valor = valor;
		this.left = left;
		this.right = right;
	}


	public static int calculateSumOfSubsequentNodes(BinaryTree node) {		
		int sumLeft = 0;
		int sumRight = 0;
		
		if (node == null) {
			return 0;
		}
		
		if(node.left != null) {
			sumLeft += node.left.valor + calculateSumOfSubsequentNodes(node.left);
		}
			
		
		if(node.right != null) {
			sumRight += node.right.valor + calculateSumOfSubsequentNodes(node.right);
		}
		
		return sumLeft + sumRight;		
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