package com.demo.beans;


public class Merg {
	public static int cnt;
	static {
		cnt=0;
	}

	//for Dividing the given array into array of size 1
	public static int mergesort(int[] a, int start, int end) {
		if(start<end) {
			cnt++;
			int mid=(start+end)/2;
			mergesort(a, start, mid);
			mergesort(a, mid+1, end);
			merge(a,start,mid,end);
		}
		return cnt;
	}

	//For Merging(Conquering) the Array 
	public static void merge(int[] a, int start, int mid, int end) {
		int i,j,k;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int[] lefttree=new int[n1];
		int[] righttree=new int[n2];
		
		for (i = 0; i < n1; i++) {
			lefttree[i]=a[start+i];
		}

		for (j = 0; j < n2; j++) {
			righttree[j] = a[mid+1+j];
		}
		
		i=0;
		j=0;
		k=start;
		
		while (i<n1 && j<n2) {
			if(lefttree[i]<righttree[j]) {
				a[k++]=lefttree[i++];
			}                                                                                                                                                      
			else {
				a[k++]=righttree[j++];
			}
			
		}
		while(j<n2) {
			a[k++]=righttree[j++];
		}
		
		while(i<n1) {
			a[k++]=lefttree[i++];
		
		}
	}

	

}
