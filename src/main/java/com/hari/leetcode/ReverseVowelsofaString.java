package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsofaString {

    static List<Character> li = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});

    static public String reverseVowels(String s) {

        int i=0, j=s.length()-1;
        char[] strArr = s.toCharArray();

        while(i<j){

            if(li.contains(strArr[i]) && li.contains(strArr[j])){
                char c = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = c;

                i++;
                j--;
            }

            if(!li.contains(strArr[i])){
                i++;
            }

            if(!li.contains(strArr[j])){
                j--;
            }

        }

        return String.valueOf(strArr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello")); //Output: "holle"
        System.out.println(reverseVowels("leetcode")); //Output: "leotcede"
        System.out.println(reverseVowels("aA")); //Output: "Aa"
    }
}
