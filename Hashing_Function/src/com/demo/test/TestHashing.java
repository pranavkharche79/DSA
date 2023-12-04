package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestHashing {

	public static void main(String[] args) {
		SingleLinkedList[] hasht=new SingleLinkedList[5];
		
		for(int i=0;i<hasht.length;i++) {
			hasht[i]=new SingleLinkedList();
		}
		
		int[] arr= {25,12,14,45,1,3,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			int pos=arr[i]%hasht.length;
			hasht[pos].addatstart(arr[i]);
		}
		
		for (int i = 0; i < hasht.length; i++) {
			System.out.print(i+"= ");
			hasht[i].display();
			System.out.println();
		}
		
		
		int search=14;
		int pos=search%hasht.length;
		System.out.println("search num at "+pos);
		if(hasht[pos].search(search)) {
			System.out.println("number exists");
		}
		else {
			System.out.println("number not exixts");
		}
	}

}
