package com.demo.test;

import com.demo.beans.StackLinkedList;

public class TestLLstack {

	public static void main(String[] args) {
		StackLinkedList n=new StackLinkedList();
		n.push(10);
		n.push(52);
		n.push(55);
		n.push(32);
		
		System.out.println(n.pop());
		 
		System.out.println(n.pop());
		System.out.println("Display method:");
		n.display();
		System.out.println("display using tostring: \n"+n);

	} 

}
