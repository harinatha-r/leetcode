package com.hari.leetcode;

import java.util.Arrays;

/*
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.

Constraints:

4 <= nums.length <= 104
1 <= nums[i] <= 104
 */
public class MaximumProductDifferenceBetweenTwoPairs {

    /*
    static public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[1]*nums[0]);
    }
    */
    static public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return (max1 * max2) - (min1 * min2);
    }
    public static void main(String[] args) {
        System.out.println(maxProductDifference(new int[]{5,6,2,7,4}));//Output: 34
        System.out.println(maxProductDifference(new int[]{4,2,5,9,7,4,8}));//Output: 64
    }
}
