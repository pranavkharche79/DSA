package com.demo.test;

import java.util.Scanner;

public class LinearSearch {
	
	public static int Linearsearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] a= {2,84,3,17,45,98,55,66,45,2};
		System.out.println(a.length);
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the number to search : ");
		int n=sc.nextInt();
		int pos= Linearsearch(a,n);
		if(pos!=-1) {
			System.out.println("Number founnd at position "+ (pos+1));
		}
		else {
			System.out.println("Number not found");
		}
	}

	

}
