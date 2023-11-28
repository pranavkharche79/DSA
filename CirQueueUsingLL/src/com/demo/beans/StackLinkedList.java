package com.demo.beans;

public class StackLinkedList {
	private Node top;
	class Node{
		
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data=data;
			next=null;
		}
		
	}
	
	public StackLinkedList() {
		super();
		top=null;
		
	}
	
	
	public Boolean isempty() {
		return top==null;
	}
	
	
	
	public void push(int n) {
		Node newnode=new Node(n);
		if(top!=null) {
			newnode.next=top;
		}
		top=newnode;
		System.out.println("Data inserted= "+n);
	}
	
	
	public int pop() {
		if(top==null) {
			System.out.println("Stack empty");
			return -1;
		}
		Node temp=top;
		top=top.next;
		temp.next=null;
		return temp.data;
		
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next; 
		}
	}
	
	
	@Override
	public String toString() {
		return "StackLinkedList [top=" + top.data + "]";
	}
	
	
}
