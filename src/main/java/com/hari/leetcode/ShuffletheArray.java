package com.hari.leetcode;

import java.util.Arrays;

public class ShuffletheArray {

    static public int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];
        int i=0, low=0, mid=n;

        while(i<nums.length){
            res[i] = nums[low];
            res[i+1] = nums[mid];

            low++;
            mid++;
            i+=2;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3))); //Output: [2,3,5,4,1,7]
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));//[1,4,2,3,3,2,4,1]
        System.out.println(Arrays.toString(shuffle(new int[]{1,1,2,2}, 2)));//[1,2,1,2]
    }
}
