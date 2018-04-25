package com.sckeedoo.certification;

import java.util.Scanner;

public class BonusPoint {
    /*
         Write a Java method to find out if a number N is tekwill-super-number.
         A tekwill-super-number is a number which contains all the even digits
         Example :
         Input: 20466861
         Output: true
         explanation: this number contains 0, 2,4,6 and 8 in it's representation

         Input: 1234568
         output false
         explanation: it does not have 0 in it's representation


         Method should take a Integer as argument, and return a boolean;
         Note that you can't convert the number into a String. you must use math operators, ex: /, %, +
     */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		System.out.println("Your result is : " + fTekNum(number));
		input.close();
	}

	static public boolean fTekNum(Integer number) 
	{
		int num = number.toString().length();
		boolean result = false;
		boolean zero = false, two = false, four = false, six = false, eight = false;
		for(int i = 0; i < num; i++) 
		{
			int div = number%10;
			if(div==0) 
			{
				zero = true;
			}
			if(div==2) 
			{
				two = true;
			}
			if(div==4) 
			{
				four = true;
			}
			if(div==6) 
			{
				six = true;
			}
			if(div==8) 
			{
				eight = true;
			}
			number/=10;
		}

		if(zero && two && four && six && eight) 
		{
			result = true;
		}
		
		else 
		{
			result = false;
		}

		return result;
	}
}