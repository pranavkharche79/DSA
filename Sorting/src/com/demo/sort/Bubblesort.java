package com.demo.sort;

import java.util.Arrays;
import java.util.Collections;

public class Bubblesort {

	public static void main(String[] args) {
		int[]arr=  {5,1,4,2,8};
		int[]arr1= {5,1,4,2,8};
		
		newbubble(arr);
		System.out.println("sorted array is : "+Arrays.toString(arr));
		modifiedBubble(arr1);
		System.out.println("sorted array is : "+Arrays.toString(arr1));
		
}

	private static void modifiedBubble(int[] arr) {
		// TODO Auto-generated method stub
		int co=0;
		int it=1;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length-i-1;j++)
			    {
					if (arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
						flag=true;
					}
					co++;
				}
			if(!flag) {
				break;
			}
			if(i<=arr.length) {
				++it;
			}
			
		}
		System.out.println("modified c= "+co +" iteration: "+it);
		
	}

	private static void newbubble(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int it=0;
		for(int i=0;i<arr.length-1;i++)
		{
				it++; 
			
			for(int j=0;j<arr.length-i-1;j++)
			    {
					if (arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					count++;
				}
			
		} 
		System.out.println("normal c= "+count+" iteration: "+it);
	}
	
	
}