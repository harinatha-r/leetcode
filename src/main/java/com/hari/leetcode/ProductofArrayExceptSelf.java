package com.hari.leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    static public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int temp=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=temp;
            temp*=nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=temp;
            temp*=nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));//Output: [24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));//Output: [0,0,9,0,0]
    }
}
