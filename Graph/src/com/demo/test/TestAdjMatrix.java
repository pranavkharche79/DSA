package com.demo.test;

import com.demo.beans.AdjescencyMatrix;

public class TestAdjMatrix {
	public static void main(String[] args) {
		AdjescencyMatrix ob=new AdjescencyMatrix(5);
		
		
		System.out.println("GRAPH =");
		System.out.println("1---------2");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("3---------4");
		System.out.println("\\         ");
		System.out.println(" \\        ");
		System.out.println("  \\       ");
		System.out.println("   5");
		System.out.println();
		
		
		ob.addedge(1, 2);
		ob.addedge(1, 3); 	
		ob.addedge(2, 4);
		ob.addedge(3, 4);
		ob.addedge(3, 5);
		System.out.println("Before Removing = ");
		System.out.println(ob);
		
		ob.removeedge(3, 5);
		System.out.println("After Removing = ");
		System.out.println(ob);
	}
}
