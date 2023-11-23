package com.demo.test;

import java.util.Scanner;

public class Factorial_Rec {

	public static void main(String[] args) {
		int[] a= {-1,2,3,5,6,8,9,10,11,15,18};
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter number for factorial : ");
		int n=sc.nextInt();
		int pos= Fact(n);
		if(pos>=0) {
			System.out.println("Factorial = "+pos);
		}
		else {
			System.out.println("Can not find factorial of -ve number");
		}

	}

	private static int Fact(int n) {
		if (n<0) {
			return -1;
		}
		else if(n==0){
			return 1;
		}
		else {
			
			return n*Fact(n-1);
		}
	}

}
