package com.sckeedoo.certification;

import java.util.ArrayList;

public class Problem4 {
	/*
    Write a method that takes an array as parameter and returns another
    array without duplicate elements

    Input:
    {1,3,4,1,4,5}
    Return:
    {1,3,4,5}
	 */
    public static void main(String[] args) {

    	int [] arrayOfInt = {1,3,4,1,4,5};
    	ArrayList<Integer> array = new ArrayList<>();
    	for (int i = 0; i < arrayOfInt.length; i++) {
			array.add(arrayOfInt[i]);
    	}

    	System.out.println(clearDuplicates(array));
    }
    public static ArrayList<Integer> clearDuplicates(ArrayList<Integer> array) {
    	ArrayList<Integer> newArray = new ArrayList<Integer>();
    	
    	for(int i = 0; i < array.size();i++) {
    		boolean exist = exist(array.get(i), newArray);
    		
    		if (exist==false)  {  				
    				newArray.add(array.get(i));
    		}
    		
    	}
    	return newArray;
    	
    }

    public static boolean exist(Integer number, ArrayList<Integer> array) {
    	boolean exist = false;
    	for (int i : array) {
			if (i == number)
				exist = true;
		}
    	return exist;
    }
}
