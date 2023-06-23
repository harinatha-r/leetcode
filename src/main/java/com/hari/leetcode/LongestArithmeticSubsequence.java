package com.hari.leetcode;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

Note that:

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).

Constraints:
2 <= nums.length <= 1000
0 <= nums[i] <= 500

 */
public class LongestArithmeticSubsequence {

    static public int longestArithSeqLength(int[] nums) {

        int ans = 0;
        int n = nums.length;
        Map<Integer,Integer>[] map = new HashMap[n];
        for(int i = 0;i<n;i++){
            map[i] = new HashMap<>();
            for(int j = 0;j<i;j++){
                int diff = nums[j]-nums[i];
                map[i].put(diff, map[j].getOrDefault(diff,1)+1);
                ans= Math.max(ans, map[i].get(diff));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestArithSeqLength(new int[]{3,6,9,12}));//Output: 4
        System.out.println(longestArithSeqLength(new int[]{9,4,7,2,10}));//Output: 3
        System.out.println(longestArithSeqLength(new int[]{20,1,15,3,10,5,8}));//Output: 4
    }
}
