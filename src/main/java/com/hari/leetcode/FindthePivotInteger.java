package com.hari.leetcode;

/*
Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

Constraints:

1 <= n <= 1000
 */
public class FindthePivotInteger {

    static public int pivotInteger(int n) {

        if(n==1) return 1;

        int rightSum=0, leftSum=0, j=n;

        for(int i=0;i<=n;i++)
            rightSum+=i;

        for(int i=n;i>=1;i--) {

            leftSum+=i;

            if(leftSum==(rightSum-leftSum+i))
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));//Output: 6
        System.out.println(pivotInteger(1));//Output: 1
        System.out.println(pivotInteger(4));//Output: -1
    }
}
