package com.demo.test;

import java.util.Scanner;

import com.demo.beans.BinarySearchTree;

public class TestBinarySerchTree {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(21);
		bst.add(22);
		bst.add(56);
		bst.add(11);
		bst.add(9);
		Scanner sc=new Scanner(System.in);
		int a=0;
		int ch=0;
		do {
		System.out.println("\n1: Add element\n2: Display by inorder\n3: Display by preorder\n4: Display by preorder ");
		System.out.println("Enter Choice= ");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the value: ");
			a=sc.nextInt();
			bst.add(a);
			break;
		case 2:
			System.out.println("Inorder= ");
			 bst.inorder();
			break;
		case 3:
			System.out.println("Preorder= ");
			bst.prerder();
			break;
		case 4:
			System.out.println("Postorder= ");
			bst.postorder();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		} while (ch!=0);
	}

}
