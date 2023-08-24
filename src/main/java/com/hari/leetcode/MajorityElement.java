package com.hari.leetcode;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */
public class MajorityElement {

    static public int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i =0 ; i<nums.length; i++) {
            if(count == 0) {
                max = nums[i];
            }
            if(nums[i] == max) {
                count++;
            } else {
                count--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));//Output: 3
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));//Output: 2
    }
}
