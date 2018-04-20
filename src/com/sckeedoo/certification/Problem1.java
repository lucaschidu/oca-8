package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem1 {
    /*
        Given two numbers N and K. Print all the numbers smaller than N that are divisible by K.
     */
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input N and K:");
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		scanner.close();
		
		while (n > 0) {
			if(n%k==0)
				System.out.println(n);
			n--;
		}

    }
}