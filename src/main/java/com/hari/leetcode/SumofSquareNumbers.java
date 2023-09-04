package com.hari.leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Constraints:

0 <= c <= 231 - 1
 */
public class SumofSquareNumbers {

    static public boolean judgeSquareSum(int c) {

        long s = 0;
        long e =  (long)Math.sqrt(c);
        while(s<=e){
            long mid = s*s + e*e;
            if(mid==(long)c){
                return true;
            }else if(mid>(long)c){
                e--;
            }else{
                s++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));//Output: true
        System.out.println(judgeSquareSum(3));//Output: false
        System.out.println(judgeSquareSum(2));//Output: true
    }
}
