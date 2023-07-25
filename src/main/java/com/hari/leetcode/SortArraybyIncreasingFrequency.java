package com.hari.leetcode;

import java.util.*;

/*
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100
 */
public class SortArraybyIncreasingFrequency {

    static  public int[] frequencySort(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums) {
            list.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Comparator<Integer> comparator = (o1, o2) -> {
            if(map.get(o1)>map.get(o2))return 1;
            else if(map.get(o1)<map.get(o2))return -1;
            else return o2-o1;
        };

        list.sort(comparator);

        int [] result = new int[list.size()];
        for(int i=0;i<result.length;i++)
            result[i]=list.get(i);

        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1,1,2,2,2,3})));//Output: [3,1,1,2,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[]{2,3,1,3,2})));//Output: [1,3,3,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));//Output: [5,-1,4,4,-6,-6,1,1,1]
    }
}
