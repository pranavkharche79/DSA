package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyLinkedList;

public class TestMyLinkedList {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyLinkedList ll=new MyLinkedList();
		ll.addAtEnd(12);
		ll.addAtEnd(13);
		ll.addAtEnd(14);
		ll.addAtEnd(15);
		int ch=0;
		do {
			System.out.println("\n1: Add element at end\n2: Display All\n3: Add At Position\n4: Add at first\n5: Delete First\n6: Delete Last\n7: Delete by Position\n8: Delect by value\n9: Exit");
			System.out.println("Enter choice: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the value to insert: ");
				int a=sc.nextInt();
				ll.addAtEnd(a);
				break;
			case 2:
				ll.display();
				break;
			case 3:
				System.out.println("Enter the value: ");
				a=sc.nextInt();
				System.out.println("Enter the position");
				int b=sc.nextInt();
				ll.addAtPosition(a,b);
				break;
			case 4:
				System.out.println("Enter the value: ");
				a=sc.nextInt();
				ll.addAtFirst(a);
				break;
			case 5:
				ll.DeleteFirst();
				break;
			case 6:
				ll.DelectLast();
				break;
			case 7:
				System.out.println("Enter the positin");
				a=sc.nextInt();
				ll.DelectByPosition(a);
				break;
			case 8:
				System.out.println("Enter the value to delete:");
				a=sc.nextInt();
				ll.DeletebyValue(a);
				break;
			case 9:
				sc.close();
				break;
			default:
				System.out.println("Invalid number: ");
				break;
			}
		} while (ch!=0);
	}

}
