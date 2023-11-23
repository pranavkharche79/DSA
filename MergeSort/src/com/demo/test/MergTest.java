package com.demo.test;

import java.util.Arrays;

import com.demo.beans.Merg;

public class MergTest {

	public static void main(String[] args) {
		int[] a= {63,52,7,10,65,50,55};
		
		Merg.mergesort(a,0,a.length-1);	
		System.out.println(Arrays.toString(a));
		
	}
}
