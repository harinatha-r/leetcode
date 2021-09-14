package com.hari.leetcode;

public class LargestOddNumberinString {

    static public String largestOddNumber(String num) {
        int l = num.length();
        for(int i = l - 1; i>=0; i--) {
            char ch = num.charAt(i);
            if(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                if(i == l -1) {
                    return num;
                }
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("7542351161")); //Output = "113389"
        System.out.println(largestOddNumber("11033890")); //Output = "113389"
        System.out.println(largestOddNumber("10133890")); //Output = "113389"
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(largestOddNumber("35420"));
    }
}
