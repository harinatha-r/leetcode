package com.hari.leetcode;

/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.


 */
public class FindMinimuminRotatedSortedArray {

    /*
    //TC: O(n)
    static public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, nums[i]);
        }
        return min;
    }
    */

    //TC:O(logn)
    static public int findMin(int[] nums) {
        int n = nums.length, min=Integer.MAX_VALUE;
        if (n == 1) return nums[0];

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] <= nums[mid]) {
                min=Math.min(min, nums[low]);
                low=mid+1;
            } else {
                min=Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));//Output: 1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));//Output: 0
        System.out.println(findMin(new int[]{11,13,15,17}));//Output: 11
    }
}
