package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
 */
public class Permutations {

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        permutation(nums, 0, list);
        return list;
    }

    static public void permutation(int[] arr, int index, List<List<Integer>> list) {
        List<Integer> ans = new ArrayList<>();
        if (arr.length == index) {
            for (int num : arr) {
                ans.add(num);
            }
            // We have generated a full permutation, so print it
            list.add(ans);
            return;
        }
        // Generate permutations by swapping the current element with each subsequent element
        for (int i = index; i < arr.length; i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            permutation(arr, index + 1, list);
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1}));
        permute(new int[]{6});
        permute(new int[]{1,2,3});
        permute(new int[]{0,1});
    }
}
