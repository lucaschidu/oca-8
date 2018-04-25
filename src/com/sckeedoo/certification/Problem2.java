package com.sckeedoo.certification;

public class Problem2 {
    /*
         Write a Java method to count all vowels in a string.
         Method should take a String as argument, and return an Integer;
     */

    public static int countVowel(String str){
        String[] vowel = new String[]{"a","o", "e", "i", "u"};
        int i = 0;
        int count = 0;
        while (i < str.length()){
            String v= String.valueOf(str.charAt(i));
            for (String ch: vowel) {
                if (ch.compareToIgnoreCase(v) ==0 ) {
                    count++;
                }
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowel(args[0]));
    }
}
