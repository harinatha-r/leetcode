package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoatLatin {

    public void test(){
        if(true){
            int a=1;
            return;
        }
    }

    static public String toGoatLatin(String sentence) {

        StringBuffer strBuf = new StringBuffer();
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String aWordIndexAtEnd = "a";
        String[] strArr = sentence.split(" ");
        for(int i=0; i<strArr.length; i++){
            String temp = null;

            if(list.contains(strArr[i].charAt(0))){
                temp = strArr[i].concat("ma").concat(aWordIndexAtEnd);
            } else {
                temp = strArr[i].substring(1).concat(String.valueOf( strArr[i].charAt(0))).concat("ma").concat(aWordIndexAtEnd);
            }

            strBuf = strBuf.append(temp).append(" ");
            //a's to add at the end of word based on index number
            aWordIndexAtEnd = aWordIndexAtEnd.concat("a");
        }

        return strBuf.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
