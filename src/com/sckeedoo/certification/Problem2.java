package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem2 
{
    /*
         Write a Java method to count all vowels in a string.
         Method should take a String as argument, and return an Integer;
     */
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);	
    System.out.println("Input the text ");
    String str = input.nextLine();
    
    System.out.println("Number of vowels is " + count_vowels(str) + '\n');
	}

	public static int count_vowels(String str)
	{
		int count = 0;
		
		for(int i = 0;i < str.length();i++) 
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				count++;
			}
		}
		return count;
	}
}
