package com.java.loops;

public class ForLoop {

	public static void main(String[] args) {
		int size=5,s=0;
		for(int i=1;i<=size;i++)
		{
			for(int k=size-1;k>=i;k--)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
				System.out.print(" *");
			
			System.out.println();
		}
		for(int i=1;i<=size-1;i++)
		{
			for( s=i;s>=1;s--)
				System.out.print(" ");
				
			for(int j=size-1;j>=i;j--)
				System.out.print(" *");
		
			System.out.println();
		}
	}

}
