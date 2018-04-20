package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem2 {
    /*
         Write a Java method to count all vowels in a string.
         Method should take a String as argument, and return an Integer;
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = in.nextLine();

        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                num++;
            }
        }


        System.out.print("Number of  Vowels in the string: " + num);
    }
}

