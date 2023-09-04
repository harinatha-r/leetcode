package com.hari.leetcode;

import java.util.Arrays;

/*
Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.

A pair (i, j) is fair if:

0 <= i < j < n, and
lower <= nums[i] + nums[j] <= upper


Constraints:

1 <= nums.length <= 10^5
nums.length == n
-10^9 <= nums[i] <= 10^9
-10^9 <= lower <= upper <= 10^9
 */
public class CounttheNumberofFairPairs {

    /*
    //TLE
    static public long countFairPairs(int[] nums, int lower, int upper) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            int ith=nums[i];
            if(ith<=upper) {
                for (int j = i + 1; j < n; j++) {
                    int sum=ith+nums[j];
                    if(sum>=lower && sum<=upper) count++;
                }
            }
        }
        return count;
    }
     */

    static public long countFairPairs(int[] nums, int lower, int upper) {
        long res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1 && (nums[i] <= 0 || nums[i] <= upper); i++) {
            int idxL =  i + 1;
            if (nums[i] < lower - nums[i])
                idxL = help_binarysearch_left(nums, i, lower - nums[i]);

            int idxR = help_binarysearch_right(nums, i, upper - nums[i]);
            if (idxR > 0 && idxL > 0 && idxL <= idxR)
                res += idxR - idxL + 1;
        }
        return res;
    }

    static private int help_binarysearch_left(int[] nums, int begin, int key){
        int idx = Arrays.binarySearch(nums, key);
        if (idx < 0) idx = - idx - 1;
        else {
            if (idx <= begin) idx = begin + 1;
            if (nums[idx] != key) return -1;

            while(idx - 1 > begin && nums[idx - 1] == key)
                idx--;
        }
        return idx;
    }

    static private int help_binarysearch_right(int[] nums, int begin, int key){

        int idx = Arrays.binarySearch(nums, key);
        if (idx < 0) idx = - idx - 2;
        else {
            if (idx <= begin) idx = begin + 1;
            if (nums[idx] != key) return -1;

            while (idx + 1 < nums.length && nums[idx + 1] == key)
                idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[]{-5,-7,-5,-7,-5},-12,-12));//Output: 6
        System.out.println(countFairPairs(new int[]{0,1,7,4,4,5},3,6));//Output: 6
        System.out.println(countFairPairs(new int[]{1,7,9,2,5},11,11));//Output: 1
    }
}
