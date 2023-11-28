package com.demo.sort;

import java.util.Arrays;

public class TestInsertionSort {
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionsort(int[] arr) {
		int n=arr.length;
		int cnt=0;
		int it=0;
		for(int i=1;i<n;i++) {
			int key=arr[i]; 
			int j=i-1;      
			
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
				it++;
			}
			arr[j+1]=key;
			cnt++;
		}
		System.out.println("iteration= "+cnt+" inner= "+it);
		
	}
}
