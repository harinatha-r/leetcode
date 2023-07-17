package com.hari.leetcode;

import java.util.Arrays;

/*
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100
 */
public class HeightChecker {

    static public int heightChecker(int[] heights) {

        int[] expected= Arrays.copyOf(heights,heights.length);
        int count=0;
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));//Output: 3
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));//Output: 5
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));//Output: 0
    }
}
