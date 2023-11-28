package com.demo.beans;

import java.util.Arrays;

public class MyStack {
	private int[] arr;
	private int top;
	private int size;
	public MyStack() {
		super();
		arr=new int[10];
		size=10;
		top=-1;
	}
	
	public MyStack(int size) {
		super();
		arr=new  int[size];
		this.size=size;
		top=-1;
	}

	@Override
	public String toString() {
		return "MyStack [arr=" + Arrays.toString(arr) + ", top=" + top + ", size=" + size + "]";
	}

	public boolean push(int i) {
		if(!isFull()) {
			arr[++top]=i;
			return true;
		}
		else {
			System.out.println("Stack over flow OR Stack is Full ");
			return false;
		}
	}


	public int pop() {
		if(!isEmpty()) {
			int num=arr[top--];
			return num;
		}
		else {
			System.out.println("Stsck UnderFlow OR Stack is Empty");
			return -1;
		}
	}

	private boolean isEmpty() {
//		if(top==-1) {
//			return true;
//		}
//		return false;
		return top==-1;
	}
	private boolean isFull() {
//		if(top==size-1) {
//			return true;
//		}
//		return false;
		return top==size-1;
	}
		
	
}
