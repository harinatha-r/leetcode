package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthMissingPositiveNumber {

    static public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - 1 - mid;
            if(missing >= k){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        int missing = arr[left] - 1 - left;
        if(missing < k){
            return arr[left] + k - missing;
        }else{
            return arr[left] - (missing - k) - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11},5));
        System.out.println(findKthPositive(new int[]{1,2,3,4},2));
    }
}
