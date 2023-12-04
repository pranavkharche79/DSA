package com.demo.beans;

public class BinarySearchTree {
	private Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void add(int val) {
		root=insertRec(root,val);
	}

	private Node insertRec(Node root, int val) {
		if(root==null) {
			root=new Node(val);
			return root;
		}
		if(val<root.data) {
			root.left=insertRec(root.left, val);
		}
		else {
			root.right=insertRec(root.right, val);
		}
		return root;
	}

	public void inorder() {
		inordertrav(root);
	}

	private void inordertrav(Node root) {
		if(root!=null) {
			inordertrav(root.left);
			System.out.print(root.data+",");
			inordertrav(root.right);
		}
	}
	
	
	public void prerder() {
		preordertrav(root);
	}

	private void preordertrav(Node root) {
		if(root!=null) {
			System.out.print(root.data+",");
			preordertrav(root.left);
			preordertrav(root.right);
		}
	}
	
	
	public void postorder() {
		postordertrav(root);
	}

	private void postordertrav(Node root) {
		if(root!=null) {
			postordertrav(root.left);
			postordertrav(root.right);
			System.out.print(root.data+",");
		}
	}
	
	
	
	
	
	
}
