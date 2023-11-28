package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;

public class TimePass {
	public static void main(String[] args) {
//		String s = "abcabcbb";
//		 StringBuilder str= new StringBuilder();
//	       
//		 for(int i=0;i<s.length()-1;i++){
//	        	if(s.charAt(i)!=s.charAt(i+1)){
//	        		str.append(s.charAt(i));
//	        	}
//	        	
//	        	if(str.length() <= (s.substring(i+1, str.length()+1).length())){
//	        		if(!str.equals(s.substring(i+1, str.length()+1))) {
//		                str.append(s.substring(i+1, str.length()+1));
//		            }
//	        	}
//	            
//	        }
//	        System.out.println(str);
//	        System.out.println(str.length());
//	        
//		String s="pranav1";
//		System.out.println(s.replaceAll("[^0-9]", ""));
		
		
		
		
		
//		String s = "is2 sentence4 This1 a3";
//		
//		Hashtable<String, String> hm = new Hashtable<String, String>();
//		String temp="";
//		for (int j = 0; j < s.length(); j++) {
//			String a="";
//			for (int i = temp.length(); i < s.length(); i++) {
//				if((int)s.charAt(i)!=32) {
//					a=a+s.charAt(i);
//				}
//				else {
//					break;
//				}
//			}
//			System.out.println(a);
//			temp=temp+" "+a;
//			if (!(a.replaceAll("[^0-9]","")).equals(" ") && (a.replaceAll("[^A-z]","")!=null)) {
//				hm.put(a.replaceAll("[^0-9]",""), a.replaceAll("[^A-z]",""));
//			}
//			
//		
//		}
//		System.out.println(s);
//		System.out.println(hm);	
		
		String s = "(]";
		int top=0;
		int tip=0;
		char[] a1=new char[s.length()/2];
		char[] a2=new char[s.length()/2];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				a1[top++]=ch;
			}
			else {
				if(ch==')') {
					
				}
			}
		}
		
		
		
		
	}        
}

