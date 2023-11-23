package com.demo.test;

import java.util.Scanner;

public class Add_recursion {
	static int count=0;
	public static int Add(int n) {
		if(n<1) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		count++;
		return n+Add(n-1);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Addition = "+Add(n));
		System.out.println(count);

	}
}
