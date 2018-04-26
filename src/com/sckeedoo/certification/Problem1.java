package com.sckeedoo.certification;

public class Problem1 
{
    /*
        Given two numbers N and K. Print all the numbers smaller than N that are divisible by K.
     */
	public static void main(String[] args) 
	{
		
		int n = 8;
		int k = 2;
		
		for(int i = 1; i < n; i++)
		{
			if(i%k == 0) 
			System.out.println(i);
			
		}
	}
}