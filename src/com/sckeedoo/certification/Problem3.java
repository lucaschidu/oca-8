package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of minutes: ");
		int minutes = in.nextInt();
		in.close();
		
		int year = minutes / 525600;
		int rMinutes = minutes % 525600;
		int day = rMinutes / 1440;

		System.out.println(minutes + " minutes is " + year +
				" years and " + day + " days.");
		
	    		
	}
}
