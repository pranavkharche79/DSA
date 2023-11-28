package com.demo.test;

import java.util.Arrays;

import com.demo.beans.HeapSort;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {5,13,10,7,8,12,9};
		
		HeapSort.heapsort(arr);
		
		System.out.println("Sorted = "+Arrays.toString(arr));

	}

}
