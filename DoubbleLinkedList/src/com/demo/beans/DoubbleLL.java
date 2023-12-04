package com.demo.beans;

public class DoubbleLL {
	private Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int val) {
			data=val;
			next=null;;
			prev=null;
		}
	}
	
	public DoubbleLL() {
		super();
		head=null;
	}
	
	public void addFirst(int a) {
		Node newnode=new Node(a);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			newnode.prev=null;
			head.prev=newnode;
			head=newnode;
		}
		
	}
	
	public void display() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("List: ");
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+",");
				temp=temp.next;
			}
		}
		System.out.println();
		
	}
	
	public void displayReverse() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("Reverse List: ");
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			while (temp!=null) {
				System.out.print(temp.data+",");
				temp=temp.prev;
			}
		}
		System.out.println();
		
	}
	
	public int length() {
		int count=0;
		if(head==null) {
			return count;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
				count++;
			}
		}
		return count;
	}

	public void addLast(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			newnode.prev=temp;
			temp.next=newnode;
			newnode.next=null;
		}
	}

	public void addAtPosition(int val, int pos) {
		if(head==null || pos==1) {
			addFirst(val);
		}
		else if(pos==length()+1) {
			addLast(val);
		}
		else {
			int i=1;
			Node newnode=new Node(val);
			Node temp=head;
			while(temp.next!=null) {
				if(i==pos-1) {
					Node cur=temp.next;
					newnode.next=cur;
					cur.prev=newnode;
					temp.next=newnode;
					newnode.prev=temp;
					break;
				}
				temp=temp.next;
				i++;
			}
		}
		
	}
	
	
	
	
	
}
