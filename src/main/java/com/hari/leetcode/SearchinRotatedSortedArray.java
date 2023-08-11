package com.hari.leetcode;

/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 */
public class SearchinRotatedSortedArray {

    //TC: O(n)
    /*
    static public int search(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }

        return -1;
    }
    */

    //TC: O(logn)
    static public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));//Output: 4
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));//Output: -1
        System.out.println(search(new int[]{1}, 0));//Output: -1
    }
}
