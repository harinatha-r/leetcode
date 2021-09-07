package com.hari.leetcode;

import java.util.HashMap;

public class ReplaceAllDigitswithCharacters {


    static HashMap<Character, Integer> map = new HashMap<>();
    static HashMap<Integer, Character> map1 = new HashMap<>();

    static{
        int num = 1;
        for(char i='a'; i<='z'; i++){
            map.put(i, num);
            map1.put(num, i);
            num++;
        }
    }

    static public String replaceDigits(String s) {

        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length-1;i=i+2){
            arr[i+1] = map1.get(map.get(arr[i])+Integer.parseInt(String.valueOf(arr[i+1])));
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1")); //Output: "abcdef"
        System.out.println(replaceDigits("a1b2c3d4e")); //Output: "abbdcfdhe"
    }
}
