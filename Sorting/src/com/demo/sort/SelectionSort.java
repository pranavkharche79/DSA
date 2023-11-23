package com.demo.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {3,2,5,9,4};
		selection_sort(arr);
		System.out.println("sorted= "+Arrays.toString(arr));
}

	private static void selection_sort(int[] arr) {
		int n=arr.length;
		int it=0;
		for(int i=0;i<n-1;i++) {
			//assum the i th number is smallest
			int min_idx=i;
			//find the position of minimum number in the array
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
				
			}
			it++;
			//put smallest number at ith location
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
			
			
		}
		System.out.println("iteration= "+it);
	}
}
