package com.hari.leetcode;

/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */
public class LongestSubarrayof1sAfterDeletingOneElement {

    /*
    //Brute Force Solution
    static public int longestSubarray(int[] nums) {

        int maxLength=0;

        for(int i=0;i<nums.length;i++){
            int countZeros=0,length=0;

            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    countZeros++;
                } else {
                    length++;
                }

                if(countZeros>1){
                    maxLength=Math.max(maxLength,length);
                    break;
                }
            }
            if(countZeros==0){
                length-=1;
            }
            maxLength=Math.max(maxLength,length);
        }

        return maxLength;
    }
    */

    //Dynamic Programming
    static public int longestSubarray(int[] nums) {
        int count1=0,count2=0,maxLength=0;
        for(int i:nums){
            if(i==0){
                maxLength=Math.max(maxLength,count2+count1);
                //count2 keeps the revoius 1's chain count
                count2=count1;
                count1=0;
            } else {
                count1++;
            }
        }

        if(count2+count1==nums.length)
            return nums.length-1;

        return Math.max(maxLength,count2+count1);
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,1,1}));//Output: 10
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));//Output: 5
        System.out.println(longestSubarray(new int[]{1,1,0,1}));//Output: 3
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,0,1,1,0,1}));//Output: 3
        System.out.println(longestSubarray(new int[]{0,1,1,1,1,1,1}));//Output: 6
        System.out.println(longestSubarray(new int[]{1,1,1}));//Output: 2
        System.out.println(longestSubarray(new int[]{1}));//Output: 0
    }
}
