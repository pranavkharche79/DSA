package com.demo.beans;

public class AdjescencyMatrix {
	private boolean[][] adjmatrix;
	private int vertices;
	
	public AdjescencyMatrix(int vertices) {
		super();
		this.vertices = vertices;
		adjmatrix=new boolean[vertices][vertices];
	}
	public void addedge(int i, int j) {
		adjmatrix[i-1][j-1]=true;
		adjmatrix[j-1][i-1]=true;
	}
	public void removeedge(int i, int j) {
		adjmatrix[i-1][j-1]=false;
		adjmatrix[j-1][i-1]=false;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0 ; i<adjmatrix.length ; i++) {
			for(int j=0 ; j<adjmatrix[i].length ; j++) {
				sb.append((adjmatrix[i][j]?1:0)+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
}
