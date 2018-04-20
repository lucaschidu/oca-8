package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem5 {
    /*
        Given a number N, find if it's prime or not (Google what prime number means, in case you don't know)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");

        int N = scan.nextInt();
        int j;
        boolean prime = true;


        for (int i = 2; i <= N / 2; i++) {
            j = N % i;
            if (j == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(N + " is a Prime Number");
        else
            System.out.println(N + " is not a Prime Number");
    }
}
