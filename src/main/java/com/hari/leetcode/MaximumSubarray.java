package com.hari.leetcode;

public class MaximumSubarray {

    static public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = 0;
        for(int  i =0;i<nums.length;i++){
            sum+=nums[i];
            maxSum =  Math.max(maxSum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));//6
        System.out.println(maxSubArray(new int[]{1}));//1
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }
}