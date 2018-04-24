package com.sckeedoo.certification;

import java.util.Scanner;


public class Problem5 
{
	public static void main(String[] args) 
	{
		int n;
		boolean isPrime = true;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number: ");
		int num = input.nextInt();
		input.close();

		for (int i = 2; i <= num/2; i++ ) 
		{
			n = num%i;
			if (n == 0) 
			{
				isPrime = false;
				break;
			}		
				
		}
		if(isPrime)
		System.out.println(num + " is a prime number.");
		else
		System.out.println(num + " isn't a prime number.");
	
	}
}
