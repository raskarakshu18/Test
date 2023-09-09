package com.java.loops;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0,a=0,b=1,n=10,i;
		System.out.print(a+" "+b);
		
		
		for(i=2;i<n;++i)
		{
			
			sum =a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}

}
