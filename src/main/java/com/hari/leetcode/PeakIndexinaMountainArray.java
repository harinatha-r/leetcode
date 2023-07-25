package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Constraints:

3 <= arr.length <= 10^5
0 <= arr[i] <= 10^6
arr is guaranteed to be a mountain array.

 */
public class PeakIndexinaMountainArray {

    static public int peakIndexInMountainArray(int[] arr) {

        int left=0, right = arr.length-1;

        while(left < right) {
            int mid = left + (right-left)/2;

            if(arr[mid] < arr[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    /*
    //Time Complexity O(n)
    static public int peakIndexInMountainArray(int[] arr) {

        HashMap<Integer, Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);
            max=Math.max(max, arr[i]);
        }

        return map.get(max);
    }
    */

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));//Output: 1
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));//Output: 1
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));//Output: 1
    }
}
