package com.demo.test;

import java.util.Arrays;

import com.demo.beans.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] a= {7,6,10,5,9,2,1,15,7};
//		int[] a= {9,15,10};
//		int[] a= {54,26,93,17,77,31,44,55,20};
		QuickSort.quicksort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
		
	}

}
