package com.demo.test;

public class TimePass {
	public static void main(String[] args) {
		int n=19;
		 int a=0;
         
        while(n>=10){
        	int result=0;
            while (n != 0)
            {
                a = n % 10;
                result += Math.pow(a, 2);
                n /= 10;
            }
            System.out.println(result);
            if(result==1){
                System.out.println("true");
                break;
            }
            n=result;
        }
        
            
        }
        
}

