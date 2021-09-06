package com.hari.leetcode;

public class MonotonicArray {

    static public boolean isMonotonic(int[] nums) {

        boolean increasing = false;
        boolean decreasing = false;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] < nums[i+1]){
                increasing = true;
            } else if(nums[i] > nums[i+1]){
                decreasing = true;
            }

            if(increasing && decreasing){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
        System.out.println(isMonotonic(new int[]{1,2,4,5}));
        System.out.println(isMonotonic(new int[]{1,1,1}));
    }
}
