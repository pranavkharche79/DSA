package com.demo.test;

import java.util.Scanner;

public class BinarySearch_Non_Rec {

	public static int binarysearch_Non_Rec(int[] a, int n) {
		int f=0,l=a.length-1;
		while(f<=l) {
			int mid=(f+l)/2;
			if(a[mid]==n) {
				return mid;
			}
			else if(a[mid]<n) {
				f=mid+1;
			}
			else {
				l=mid-1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] a= {2,3,5,6,8,9,10,11,15,18};
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the number to search : ");
		int n=sc.nextInt();
		int pos= binarysearch_Non_Rec(a,n);
		if(pos!=-1) {
			System.out.println("Number founnd at position "+(pos+1));
		}
		else {
			System.out.println("Number not found");
		}
	}

	

}
