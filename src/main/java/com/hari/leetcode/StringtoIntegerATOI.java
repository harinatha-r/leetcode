package com.hari.leetcode;

public class StringtoIntegerATOI {

    static public int myAtoi(String s) {
        String orgS = s ;
        s = s.trim();                   //Discards spaces at starting or ending
        s = s.split("\\s+")[0];          //Works exactly as .split(" ") with multiple spaces
        int n = s.length();
        int index = n;
        for(int i=n-1; i>0; i--) {
            if(!Character.isDigit(s.charAt(i))) index = i;
        }
        s = s.substring(0, index);
        double res;
        try {
            res = Double.parseDouble(s);
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return res < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        catch(Exception e) {
            System.out.println("Exception: " + orgS);
            return 0;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-5-"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("20000000000000000000"));
        System.out.println(myAtoi("  +0 120"));
        System.out.println(myAtoi("00000-420a1234"));
        System.out.println(myAtoi("-"));
        System.out.println(myAtoi("+"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("+-12"));
        System.out.println(myAtoi(""));
        System.out.println(myAtoi(" "));
        System.out.println(myAtoi("abc"));
        System.out.println(myAtoi("abc123"));
        System.out.println(myAtoi("42"));

        System.out.println(myAtoi("3.14159"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("-91283472332"));
    }
}