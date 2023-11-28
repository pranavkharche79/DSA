package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		System.out.println("Enter size of queue: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		MyQueue ob= new MyQueue(a);
		
		ob.enqueue(5);
		ob.enqueue(1);
		ob.enqueue(2);
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		
		
		ob.enqueue(55);
		ob.enqueue(56);
		ob.enqueue(57);
		ob.enqueue(58);
		ob.enqueue(59);
		ob.enqueue(59);
		
	
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
	}

}
