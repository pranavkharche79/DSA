package com.demo.test;

import java.util.Scanner;

import com.demo.beans.DoubbleLL;

public class TestDoubbleLL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoubbleLL dll=new DoubbleLL();
		dll.addLast(11);
		dll.addLast(12);
		dll.addLast(13);
		dll.addLast(14);
		dll.addLast(15);
		int ch=0;
		int a=0;
		do {
		System.out.println("\n1: Add First\n2: Add Last\n3: Add At Position\n8: Display Reverse\n9: Display");
		System.out.println("Enter choice: ");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Emter value: ");
			a=sc.nextInt();
			dll.addFirst(a);
			break;
		case 2:
			System.out.println("Emter value: ");
			a=sc.nextInt();
			dll.addLast(a);
			break;
		case 3:
			System.out.println("Enter value: ");
			a=sc.nextInt();
			System.out.println("Enter position: ");
			int b=sc.nextInt();
			dll.addAtPosition(a,b);
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			dll.displayReverse();
			break;
		case 9:
			dll.display();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
			
		} while (ch!=0);
	}

}
