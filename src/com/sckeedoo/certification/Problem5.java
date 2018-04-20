package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem5 {
    /*
        Given a number N, find if it's prime or not (Google what prime number means, in case you don't know)
     */
	public static void main(String args[]){
	       Scanner input = new Scanner(System.in);
	       System.out.println("Enter the number :  ");
	       int inputNumber=input.nextInt();
	       input.close();
	       if(inputNumber%2==0 && inputNumber!=2) {
	    	   System.out.println(inputNumber+" is not a prime");
	           System.out.println(inputNumber+" Divide by 2");
	          return;
	       }
	       
	       for(int i=2;i<inputNumber;i++){
	       int remainder=inputNumber%i;
	           if(remainder==0){
		           System.out.println(inputNumber+" is not a prime");
		           System.out.println(inputNumber+" Divide by "+i);   
		           return;
	           }
	           
	       }
	       System.out.println("Number is prime"); 
	     }
}
