package BinaryTree;

public class BinaryTree <E> {
	
// for binary class know the reference to the root	
	protected Node <E> root;	
	
	//References
	private static class Node <E>{
		private E data;
		private Node <E> parent;
		private Node <E> left;
		private Node <E> right;
		
		//public node for the constructor
		public Node (E data) {
		this.data = data;
		parent = null;
		left = null;
		right = null;
		}
		
		//override to string method, print the information stored in the specific null
		public String toString() {
			return data.toString();
		}
	}
	
	// creates an empty tree
	public BinaryTree () {
		root = null;
	}
	
	//set the root of the tree
	public BinaryTree (Node <E> root) {
		this.root = root;
	} 
	
	//overload to define different type of arguments
	public BinaryTree (E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		root = new Node <E>(data);
		if (leftTree!= null) {
			root.left = leftTree.root;
		}
		else 
		{
			root.left = null;
		}
		
		if (rightTree!= null) {
			root.right = rightTree.root;
		}
		else 
		{
			root.right = null;
		}
	}
	
	// tree and the left tree is not empty
	public BinaryTree<E> getLeftSubtree (){
	if (root!=null && root.left!= null)
		return new BinaryTree<E>(root.left);
	else
		return null;
	}
	
	//Textual representation of the tree
	public String toString () {
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1 , sb);
		return sb.toString ();
	}	
	
	private void preOrderTraverse (Node<E> node, int depth, StringBuilder sb) {
		for (int i = 1; i <depth; i ++) {
			sb.append("  ");
		}
		if (node==null) {
			sb.append("null\n");
		}
		else {
		sb.append(node.toString());
		sb.append ("\n");
		preOrderTraverse(node.left, depth+1, sb);  //recursive calls
		preOrderTraverse(node.right, depth+1, sb);
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree<String> bx = new BinaryTree<String> ("x", null, null);
		BinaryTree<String> by = new BinaryTree<String> ("y", null, null);
		BinaryTree<String> bplus = new BinaryTree<String> ("+", bx, by);
		
		System.out.println (bplus.toString());
	}

}
