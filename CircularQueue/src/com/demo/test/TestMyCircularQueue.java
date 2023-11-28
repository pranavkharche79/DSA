package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyCircularQueue;

public class TestMyCircularQueue {

	public static void main(String[] args) {
		System.out.println("Enter size of stack: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		MyCircularQueue ob= new MyCircularQueue(a);
		
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		System.out.println(ob);
		
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		
		System.out.println(ob);
		
		ob.enqueue(55);
		ob.enqueue(56);
		ob.enqueue(57);
		ob.enqueue(58);
		ob.enqueue(59);
		
		System.out.println(ob);
		
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		System.out.println(ob);
		
		sc.close();
	}

}
