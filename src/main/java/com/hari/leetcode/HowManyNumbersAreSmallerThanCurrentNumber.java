package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Constraints:

2 <= nums.length <= 500
0 <= nums[i] <= 100

 */
public class HowManyNumbersAreSmallerThanCurrentNumber {

    /*
    //Brute-Force Solution with HashMap
    static public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        Map<Integer, Integer> hMap=new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int count = 0;

            if (hMap.containsKey(nums[i])) {
                result[i] = hMap.get(nums[i]);
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        if (nums[j] < nums[i]) {
                            count++;
                        }
                    }
                }
                hMap.put(nums[i], count);
                result[i] = count;
            }
        }

        return result;
    }
    */

    /*
    So the idea is:
Let's use this input for illustration: [8,1,2,2,3]

    1. Create a copy of the input array. copy = [8,1,2,2,3]
    2. Sort the copy array. copy = [1,2,2,3,8]
    3. Fill the map: number => count (where count is an index in sorted array, so first number with index 0 has 0 numbers less than it, index 1 has 1 number less, etc). We update only first time we enocunter the number so that way we skip duplicates.
        map[1]=>0
        map[2]=>1
        map[3]=>3
        map[8]=>4
    4. We re-use our copy array to get our result, we iterate over original array, and get counts from the map.
        [4,0,1,1,3]

     */
    static public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));//Output: [4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6,5,4,8})));//Output: [2,1,0,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7})));//Output: [0,0,0,0]
    }
}
