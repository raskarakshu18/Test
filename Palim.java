package com.java.loops;

public class Palim {

	public static void main(String[] args) {
		int n=223,div=10,r=0,org=n,sum=0;
		while(n>0)
		{
			r=n%div;
			sum=(sum*10)+r;
			n=n/div;
		}
		System.out.println("Reverse of the number is :"+sum);
		
		if(org==sum)
		   System.out.println("Number is a plaindrome");
		else
			System.out.println("Number is not a plaindrome");
	}

}
//not working with numbers like 100,500,120,003