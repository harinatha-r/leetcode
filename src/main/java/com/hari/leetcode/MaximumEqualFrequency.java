package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*

Given an array nums of positive integers, return the longest possible length of an array prefix of nums, such that it is possible to remove exactly one element from this prefix so that every number that has appeared in it will have the same number of occurrences.

If after removing one element there are no remaining elements, it's still considered that every appeared number has the same number of ocurrences (0).


Constraints:

2 <= nums.length <= 10^5
1 <= nums[i] <= 10^5

 */
public class MaximumEqualFrequency {

    static public int maxEqualFreq(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            // update counts
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            int freq = countMap.get(nums[i]);
            // update counts with that frequency
            freqMap.put(freq, freqMap.getOrDefault(freq, 0) + 1);

            int count = freqMap.get(freq) * freq;
            if (count == i + 1 && i != nums.length - 1) { // case 1
                res = Math.max(res, i + 2);
            } else if (count == i) { // case 2
                res = Math.max(res, i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxEqualFreq(new int[]{2,2,1,1,5,3,3,5}));//Output: 7
        System.out.println(maxEqualFreq(new int[]{1,1,1,2,2,2,3,3,3,4,4,4,5}));//Output: 13
    }
}
