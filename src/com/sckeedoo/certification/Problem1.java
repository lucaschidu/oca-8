package com.sckeedoo.certification;

public class Problem1 {
    /*
        Given two numbers N and K. Print all the numbers smaller than N that are divisible by K.
     */
    public static void main(String[] args) {
        int num1;
        int num2;

        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        while (num1 >0 ){
            num1--;
            if (num1 % num2 == 0)
                System.out.println(num1);
        }
    }
}
