package com.demo.beans;

public class SingleLinkedList {
	private Node head;
    class Node{
    	int n;
    	Node next;
    	Node(int d){
    		n=d;
    		next=null;
    	}
    	
    }
    public SingleLinkedList() {
    	head=null;
    }
    
    
	public void addatstart(int val) {
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
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.n+",");
				temp=temp.next;
			}
		}
	}


	public boolean search(int val) {
		Node temp=head;
		while(temp!=null) {
			if(temp.n==val) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
    
    
    
}
