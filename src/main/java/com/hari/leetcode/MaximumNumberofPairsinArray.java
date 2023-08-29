package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
You are given a 0-indexed integer array nums. In one operation, you may do the following:

Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
 */
public class MaximumNumberofPairsinArray {

    /*
    static public int[] numberOfPairs(int[] nums) {
        if(nums.length==1 && (nums.length==2 && nums[0]!=nums[1]))
            return new int[]{0,1};

        if(nums.length==2 && nums[0]==nums[1])
            return new int[]{1,0};

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i,0)+1);

        int pairs=0, singles=0;
        for(int i:map.keySet()){
            pairs+=map.get(i)/2;
            singles+=map.get(i)%2;
        }

        return new int[]{pairs, singles};
    }
     */

    static public int[] numberOfPairs(int[] nums) {
        int pairs = 0, leftover = 0;
        int[] arr = new int[101];

        for (int num : nums) {
            arr[num]++;
        }

        for (int num : arr) {
            pairs += num / 2;
            leftover += num % 2;
        }
        return new int[] {pairs,leftover};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1,3,2,1,3,2,2})));//Output: [3,1]
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1,1})));//Output: [1,1]
        System.out.println(Arrays.toString(numberOfPairs(new int[]{0})));//Output: [0,1]
    }
}
