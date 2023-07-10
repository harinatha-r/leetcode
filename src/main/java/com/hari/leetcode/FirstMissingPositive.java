package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    /*
    static public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i:nums) {
            if(i>0) {
                set.add(i);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                return i+1;
            }
        }
        return nums.length+1;
    }
    */

    static public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Ignore non-positive numbers and numbers greater than n
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Step 2: Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 3: Find the smallest missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;

    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));//Output: 3
        System.out.println(firstMissingPositive(new int[]{1,2,3}));//Output: 4
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));//Output: 2
        System.out.println(firstMissingPositive(new int[]{7,8,9,11,12}));//Output: 1
        System.out.println(firstMissingPositive(new int[]{4,3,1,2}));//Output: 5
    }
}
