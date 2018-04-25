package com.sckeedoo.certification;

import java.util.ArrayList;
import java.util.List;

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

    public static boolean superTek(int num){
        List<Integer> list = new ArrayList<Integer>();
        while (num != 0){
            int cn = num % 10;
            if (cn % 2 == 0)
                if (!list.contains(cn))
                    list.add(cn);
            num /= 10;
        }
        if (list.size() == 5)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(superTek(Integer.parseInt(args[0])));
    }
}
