package com.sckeedoo.certification;


import java.util.*;

public class Problem4 
{
	public static void main (String[] args) 
    {  
       int[] arraylist = {1,3,4,1,4,5};
       ArrayList<Integer> array = new ArrayList<>();
    	for (int i = 0; i < arraylist.length; i++) 
    	{
			array.add(arraylist[i]);
		}
    	System.out.println(delDupl(array));
    }
	public static boolean verif(Integer num, ArrayList<Integer> array)
	{
      
		boolean verif = false;
		for (int i : array) 
		{
			if (i == num)
				verif = true;
		}
		return verif;
		
	}	

       public static ArrayList<Integer> delDupl(ArrayList<Integer> array)
         {
        	 ArrayList<Integer> newArr = new ArrayList<>();
        	 for (int i = 0; i < array.size();i++) {
        	 boolean verif = verif(array.get(i), newArr);
        	 if (verif == false) {
        		 newArr.add(array.get(i));
        	 }
        	 
        	 }
        	 return newArr;
         }
}
