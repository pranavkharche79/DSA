package com.demo.test;

import java.util.Scanner;

public class BinarySearch_With_Rec {
	static int cnt=0;
	public static void main(String[] args) {
		int[] a= {-1,2,3,5,6,8,9,10,11,15,18};
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the number to search : ");
		int n=sc.nextInt();
		int pos= binarysearchwithRec(0,a.length-1,n,a);
		if(pos!=-1) {
			System.out.println("Number founnd at position "+(pos+1));
		}
		else {
			System.out.println("Number not found");
		}
		System.out.println("count= "+cnt);
	}

	public static int binarysearchwithRec(int f, int l, int n, int[] a) {
		
		if (f>l) {
			return -1;
		} else {
			cnt++;
			int mid=(f+l)/2;
			if(a[mid]==n) {
				return mid;
			}
			else if(a[mid]<n) {
				return binarysearchwithRec(mid+1, l, n, a);
			}
			else {
				return binarysearchwithRec(f, mid-1, n, a);
			}
		}
	}

}
