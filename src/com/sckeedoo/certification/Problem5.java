package com.sckeedoo.certification;

public class Problem5 {
    /*
        Given a number N, find if it's prime or not (Google what prime number means, in case you don't know)
     */
    public static int is_prime(int num){
        int item = num - 1;
        int count = 2;
        if (num == 2)
            return 1;
        while (item < 2){
            if (num % count == 0)
                return (0);
            item--;
            count++;
        }
        return 1;
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        if (is_prime(num) == 1)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}
