package com.demo.test;

import java.util.Arrays;

import com.demo.beans.Merg;

public class MergTest {

	public static void main(String[] args) {
		int[] a= {63,52,7,10,65,50,55};
		
		int cnt=Merg.mergesort(a,0,a.length-1);	
		System.out.println("Sorted= "+Arrays.toString(a));
		System.out.println("Iteration = "+cnt);
	}
}
