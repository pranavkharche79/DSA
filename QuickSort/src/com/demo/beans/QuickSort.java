package com.demo.beans;

import java.util.Arrays;

public class QuickSort {
	static int cnt=0;
	public static void quicksort(int[] a, int lb, int ub) {
		
		if(lb<ub) {
			cnt++;
			System.out.println("Iteration= "+cnt+"\n"+Arrays.toString(a)+"\n");
			int loc=partition(a,lb,ub);
			quicksort(a, lb, loc-1);
			quicksort(a, loc+1, ub);
		}
		
	}

	private static int partition(int[] a, int lb, int ub) {
		
		int pivot=a[lb];
		int start=lb+1;
		int end=ub;
		while (start<end) {
			System.out.println(Arrays.toString(a));
			while (a[start]<=pivot) {
				start++;
			}
			while (a[end]>pivot) {
				end--;
			}
			if(start<end) {
				int tem=a[start];
				a[start]=a[end];
				a[end]=tem;
//				System.out.println("start<end= "+Arrays.toString(a));
			}
		}
		
		int temp=a[lb];
		a[lb]=a[end];
		a[end]=temp;
		return end;
		
	}

}
