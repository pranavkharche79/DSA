package com.demo.beans;

import java.util.Arrays;

public class MyQueue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public MyQueue() {
		size=10;
		arr=new int[size];
		front=0;
		rear=-1;
	}
	
	public MyQueue(int s) {
		size = s;
		arr = new int[size];
		front=0;
		rear=-1;
	}
	
	private boolean isFull() {
		return rear==size-1;
	}
	
	private boolean isEmpty() {
		return front>rear;
	}
	
	public void enqueue(int i) {
		if(!isFull()) {
			arr[++rear]=i;
			System.out.println(i+" added in the queue");
		}
		else {
			System.out.println("queue is full, cannot add");
		}
		
	}
	
	
	public int dequeue() {
		if(!isEmpty()) {
			int temp=arr[front++];
			System.out.println("removed value from front end "+front+"---->"+temp);
			return temp;
		}
		else {
			System.out.println("Queue is Empty");
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return Arrays.toString(arr)+" front :"+front+" rear: "+rear;
	}
	
	
	
}
