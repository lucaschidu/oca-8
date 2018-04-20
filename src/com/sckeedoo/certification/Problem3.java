package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem3 {
	/*
    Write a Java program to convert minutes into a number of years and days.
    Test Data
    Input the number of minutes: 3456789
    Expected Output :
    3456789 minutes is approximately 6 years and 210 days
	*/
    public static void main(String[] args) {
    	System.out.println("Input the number of minutes: ");
    	Scanner input = new Scanner(System.in);
    	final int minutes = input.nextInt(), day = 60*24, year = day*365;
    	input.close();
    	 
    	int years = minutes/year;
    	int days = (minutes-years*year)/day;
    	System.out.println(minutes + " is approximately " + years+ " years and " + days + " days");

    }
}
