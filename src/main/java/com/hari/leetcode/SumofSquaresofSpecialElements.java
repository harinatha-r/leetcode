package com.hari.leetcode;

/*
You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.

Constraints:

1 <= nums.length == n <= 50
1 <= nums[i] <= 50
 */
public class SumofSquaresofSpecialElements {

    static public int sumOfSquares(int[] nums) {

        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            if(n%(i+1)==0)
                sum+=(nums[i]*nums[i]);
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1,2,3,4}));//Output: 21
        System.out.println(sumOfSquares(new int[]{2,7,1,19,18,3}));//Output: 63
    }
}
