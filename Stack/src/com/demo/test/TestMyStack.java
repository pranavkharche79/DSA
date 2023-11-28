package com.demo.test;

import java.util.Scanner;
import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		System.out.println("Enter size of stack: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		MyStack ob= new MyStack(4);
		
		ob.push(5);
		ob.push(6);
		ob.push(7);
		ob.push(8);
		ob.push(1);
		
		ob.pop();
		ob.pop();
		
		System.out.println(ob);
		
	}

}
