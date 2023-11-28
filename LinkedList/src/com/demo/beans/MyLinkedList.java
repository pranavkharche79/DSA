package com.demo.beans;

public class MyLinkedList {
	private Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data=d;
			next=null;
		}
	}
	
	public MyLinkedList() {
		head=null;
	}

	public void addAtEnd(int a) {
		Node newnode=new Node(a);
		if(head==null) {
			head=newnode; 
			// head.next=null;   //optional 
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}

	public void display() {
		if(head==null) {
			System.out.println("linked list is empty");
		}
		else {
			Node temp=head;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	
	public int length() {
		Node cur=head;
		int count=0;
		while(cur!=null) {
			count++;
			cur=cur.next;
		}
//		System.out.println("length= "+count);
		return count;
	}

	public void addAtFirst(int a) {
		Node newnode=new Node(a);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public void addAtPosition(int val, int pos) {
		int i=1;
		if(head==null) {
			System.out.println("List is Empty");
		}
		if(pos==1) {
			addAtFirst(val);
		}
		else {
			Node newnode=new Node(val);
			Node cur= head;
			while(cur!=null) {
				if(i==pos-1) {
					if(cur.next.next!=null) {
						newnode.next=cur.next;
						cur.next=newnode;
						break;
					}
					else {
						newnode.next=null;
						cur.next=newnode;
					}
					
				}
				cur=cur.next;
				i++;
				if(i<pos) {
					length();
					System.out.println("Position is wrong");
					break;
				}
			}
			
		}
	}

	public void DeleteFirst() {
		    if(head==null) {
		    	System.out.println("List is empty can not delect");
		    }
		    else {
		    	Node temp=head;
		    	head=head.next;
		    	temp.next=null;
		    	temp=null;
		    }
		
	}

	public void DelectLast() {
		if(head==null) {
	    	System.out.println("List is empty can not delect");
	    }
		else {
			Node cur=head.next;
			if(head.next==null) {
				System.out.println("sdhgt");
				head=null;
			}
			else {
				System.out.println("inside else");
				Node temp=head;
				while(cur.next!=null) {
					System.out.println("while");
					cur=cur.next;
					temp=temp.next;
				}
				System.out.println("outside while");
				temp.next=null;
				cur.next=null;
				cur=null;
			}
		}
		
	}

	public void DelectByPosition(int pos) {
		if(pos==length()) {
			DelectLast();
			return;
		}
		if(pos==1) {
			 DeleteFirst();
		}
		else {
			 int i=1;
			 Node temp=head;
			 while(i<pos-1) {
				 temp=temp.next;
				 i++;
			 }
			 temp.next=temp.next.next;
		 }
		 
	}
	
	
	public void DeletebyValue(int val) {
		Node temp=head;
		Node cur=head.next;
		if(head.data==val) {
			DeleteFirst();
		}
		else {
			while(cur.next!=null) {
				System.out.println("data= " +cur.data);
				if(cur.data==val) {
					if(cur.next==null) {
						temp.next=null;
						return;
					}
					else {
						temp.next=cur.next;
						return;
					}
				}
				cur=cur.next;
				temp=temp.next;
			}
			System.out.println("Element not found ");
			
		}
		
	}
	
	
	
}
