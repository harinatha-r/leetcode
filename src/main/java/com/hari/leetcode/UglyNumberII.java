package com.hari.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

Constraints:

1 <= n <= 1690
 */
public class UglyNumberII {

    static public int nthUglyNumber(int n) {

        int[] dp=new int[n+1];
        int p2=1,p3=1,p5=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int min=Math.min(2*dp[p2],Math.min(3*dp[p3],5*dp[p5]));
            dp[i]=min;
            if(2*dp[p2]==min) p2++;
            if(3*dp[p3]==min) p3++;
            if(5*dp[p5]==min) p5++;
        }
        return dp[n];
    }
    public static void main(String[] args) {

        System.out.println(nthUglyNumber(10));//Output: 12
        System.out.println(nthUglyNumber(1));//Output: 1
    }
}
