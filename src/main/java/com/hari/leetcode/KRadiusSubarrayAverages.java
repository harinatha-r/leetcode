package com.hari.leetcode;

import java.util.Arrays;

/*
You are given a 0-indexed array nums of n integers, and an integer k.

The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.

Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.

The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.

For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.


Constraints:
n == nums.length
1 <= n <= 105
0 <= nums[i], k <= 105


 */
public class KRadiusSubarrayAverages {

    //Test cases passed: 23/39 Error:Time Limit Exceeded
    /*
    static public int[] getAverages(int[] nums, int k) {

        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        if(nums.length<=k)
            return result;

        for (int i = k; i < nums.length - k; i++) {
            result[i] = getAverage(Arrays.copyOfRange(nums, i - k, i + k + 1));
        }


        return result;
    }

    static public int getAverage(int[] subArr) {
        Arrays.stream(subArr).sum();
        return Arrays.stream(subArr).sum()/subArr.length;
    }
     */


    static public int[] getAverages(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int midIndex = k;
        int windowsize = 2*k+1;

        int i=0,j=0;
        long sum = 0l; //should accomodate larger sum
        Arrays.fill(arr,-1);

        while(j<nums.length){
            sum += nums[j];
            if(j-i+1 < windowsize){
                j++;
            }
            else if(j-i+1 == windowsize){
                arr[midIndex++] = (int)(sum/windowsize);
                sum -= nums[i];
                i++;
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{7,4,3,9,1,8,5,2,6}, 3)));//Output: [-1,-1,-1,5,4,4,-1,-1,-1]
        System.out.println(Arrays.toString(getAverages(new int[]{100000}, 0)));//Output: [100000]
        System.out.println(Arrays.toString(getAverages(new int[]{8}, 100000)));//Output: [-1]
    }
}
