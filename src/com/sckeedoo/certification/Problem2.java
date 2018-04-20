package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem2 {
	/*
	    Write a Java method to count all vowels in a string.
	    Method should take a String as argument, and return an Integer;
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("There are " + countVowels(string) + " vowels.");
		System.out.println("There are " + countVowelsAdvncd(string) + " vowels. Advanced mode");
		scanner.close();
	}
	static public int countVowels(String s){
		int vowels = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.toLowerCase().charAt(i)=='a' || s.toLowerCase().charAt(i)=='e' || s.toLowerCase().charAt(i)=='i'
					|| s.toLowerCase().charAt(i)=='o' || s.toLowerCase().charAt(i)=='u')
				vowels++;
		}
		
		return vowels;
	}
	
	static public int countVowelsAdvncd(String s){
		
		return s.replaceAll( "(?i)[^aeiou]+", "" ).length();
		
	}
}
