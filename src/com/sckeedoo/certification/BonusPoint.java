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
 /*   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");

        int N = scan.nextInt();
        int pare = 0;
        while (N > 0) {
            int num = N % 10;
            if (num % 2 == 0) {
                pare=pare+1;
            }

        }

    }

}