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
	    explanation: it does not have 0 in it's represetnation
	    Method should take a Integer as argument, and return a boolean;
	    Note that you can't convert the number into a String. you must use math operators, ex: /, %, +
	*/
	public static void main(String[] args) {
    	
    	Scanner input = null;
    	
    	try{
	    	input =	new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = input.nextInt();
			input.close();
			System.out.println(checkIfHaveAllEvenNumbers(number));
    	}
		finally {
			if(input!=null)
				input.close();
		}
		
		
	}
	
	static public boolean checkIfHaveAllEvenNumbers(Integer number) {

		int length = Integer.toString(number).length();
		boolean zero = false, two = false, four = false, six = false, eight = false;
		
		for (int i = length; i > 0; i--) {
			int div = number%10;
			
			switch (div) {
			case 0:
				zero = true;
				break;
			case 2:
				two = true;
				break;
			case 4:
				four = true;
				break;
			case 6:
				six = true;
			case 8:
				eight = true;
				break;
			}
				
			number /=10;
		}
		if(zero && two && four && six && eight) {
			return true;
		} else {
			return false;
		}
	}
}