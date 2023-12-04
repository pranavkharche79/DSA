package com.demo.beans;

public class SinglyLinkedList {
	private Node head;
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	public SinglyLinkedList() {
		super();
		head=null;
	}
	
	public void addstart(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}
	
}
