package com.hari.leetcode;

public class MinimumChangesToMakeAlternatingBinaryString {

    static public int minOperations(String s) {

        char[] arr = s.toCharArray();

        int oper1 = 0, oper2 = 0;

        // either the string starts with 0
        char c = '0';
        for(int x = 0; x < arr.length; x++) {
            if(arr[x] != c) {
                oper1++;
            }
            c = c == '0'? '1': '0';
        }

        // or the string starts with 1
        c = '1';
        for(int x = 0; x < arr.length; x++) {
            if(arr[x] != c) {
                oper2++;
            }
            c = c == '0'? '1': '0';
        }

        return oper1 < oper2 ? oper1: oper2;
    }

    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
        System.out.println(minOperations("10"));
        System.out.println(minOperations("1111"));
    }
}
