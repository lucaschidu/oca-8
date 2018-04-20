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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");

        int minutes = scan.nextInt();

        int year =  minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");


    }
}
