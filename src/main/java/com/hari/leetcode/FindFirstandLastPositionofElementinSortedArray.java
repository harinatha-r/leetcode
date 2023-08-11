package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindFirstandLastPositionofElementinSortedArray {

    /*
    static public int[] searchRange(int[] nums, int target) {

        int start=-1, end = -1;

        for(int i=0; i<nums.length; i++){

            if(start != -1 && end == -1 && nums[i] == target){
                end = i;
            }

            if(start == -1 && nums[i] == target){
                start = i;
            }

            if(end != -1 && nums[i] == target){
                end = i;
            }

        }

        if(end == -1){
            end = start;
        }

        return new int[]{start, end};
    }
     */
    static public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=findFirst(nums,target);
        arr[1]=findLast(nums,target);
        return arr;
    }

    static public int findFirst(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;

            if(arr[mid]<target) {
                Start=mid+1;
            }
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                End=mid-1;
            }
        }
        return index;
    }

    static public int findLast(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;

            if(arr[mid]<target) {
                Start=mid+1;
            }
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                Start=mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] res5 = searchRange(new int[]{3,3,3}, 3);
        System.out.println("res: " + res5[0] + "," + res5[1]);
        int[] res = searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println("res: " + res[0] + "," + res[1]);
        int[] res1 = searchRange(new int[]{5,7,7,8,8,10}, 6);
        System.out.println("res: " + res1[0] + "," + res1[1]);
        int[] res2 = searchRange(new int[]{}, 0);
        System.out.println("res: " + res2[0] + "," + res2[1]);
        int[] res3 = searchRange(new int[]{1}, 1);
        System.out.println("res: " + res3[0] + "," + res3[1]);
        int[] res4 = searchRange(new int[]{1, 3}, 1);
        System.out.println("res: " + res4[0] + "," + res4[1]);
    }
}
