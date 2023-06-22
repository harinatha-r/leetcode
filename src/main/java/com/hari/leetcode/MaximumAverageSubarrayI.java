package com.hari.leetcode;

/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Constraints:
n == nums.length
1 <= k <= n <= 105
-10^4 <= nums[i] <= 10^4

 */
public class MaximumAverageSubarrayI {

    static public double findMaxAverage(int[] nums, int k) {

        double currentSum = 0;
        double currentAvg = 0;
        double maxAvg = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            currentSum += nums[i];
            if(i >= (k-1)){
                currentAvg = currentSum/k;
                maxAvg = Math.max(maxAvg, currentAvg);
                currentSum -= nums[i-(k-1)];
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));//Output: 12.75000
        System.out.println(findMaxAverage(new int[]{5},1));//Output: 5.00000
    }
}
