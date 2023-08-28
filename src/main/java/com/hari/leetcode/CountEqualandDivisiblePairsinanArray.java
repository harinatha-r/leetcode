package com.hari.leetcode;

/*
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.

 */
public class CountEqualandDivisiblePairsinanArray {

    static public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && (i*j)%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{3,1,2,2,2,1,3}, 2));//Output: 4
        System.out.println(countPairs(new int[]{1,2,3,4}, 1));//Output: 0
    }
}
