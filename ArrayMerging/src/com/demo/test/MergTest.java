package com.demo.test;

import java.util.Arrays;

import com.demo.beans.Merg;

public class MergTest {

	public static void main(String[] args) {
		int[] a= {1,9,4,7,3,67,43,24,78,99};
		
		Merg.mergesort(a,0,a.length-1);	
		System.out.println(Arrays.toString(a));
		
	}
}
