package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
 */
public class TwoSumIIInputArrayIsSorted {

    static public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i]),i+1};
            } else {
                map.put(numbers[i],i+1);
            }
        }

        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));//Output: [1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},6)));//Output: [1,3]
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0},-1)));//Output: [1,2]
    }
}
