package com.java.loops;

public class Armstrong {

	public static void main(String[] args) {
		int number=370,r=0,sum=0,num;
		num=number;
		while(number!=0)
		{
			
			r=(number%10);
			sum +=(r*r*r);
			number=number/10;
		}
		if(sum==num)
			System.out.println("It's a Armstorng number. ");
		else
			System.out.println("It's not a Armstorng number. ");
	}

}
