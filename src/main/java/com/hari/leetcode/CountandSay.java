package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

Given a positive integer n, return the nth term of the count-and-say sequence.


Constraints:

1 <= n <= 30

 */
public class CountandSay {

    static public String countAndSay(int n) {
        String s = "1";
        for(int i=2;i<=n;i++){
            s = countIndex(s);
        }
        return s;
    }

    static public String countIndex(String s){
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == c)
                count++;
            else{
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count=1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.println(countAndSay(1));//Output: "1"
        System.out.println(countAndSay(4));//Output: "1211"
        System.out.println(countAndSay(5));//Output: "1211"
        System.out.println(countAndSay(2));//Output: "2"
    }
}

