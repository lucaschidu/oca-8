package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem1 {
    /*
        Given two numbers N and K. Print all the numbers smaller than N that are divisible by K.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write a number N: ");
        int N  = scan.nextInt();
        System.out.print("Write a number K: ");
        int K = scan.nextInt();

        for (N=N; N>=K; N--) {

            if (N%K==0)
                System.out.println(N);

        }


    }
}
