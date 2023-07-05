package com.hari.leetcode;

import java.util.Arrays;

/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5
 */
public class ReplaceElementswithGreatestElementonRightSide {

    /*
    //Brute Force
    static public int[] replaceElements(int[] arr) {

        if(arr.length==1)
            return new int[]{-1};

        int[] res=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max, arr[j]);
            }
            res[i]=max;
        }

        return res;
    }
    */

    static public int[] replaceElements(int[] arr) {
        if(arr.length==1)
            return new int[]{-1};

        int max = -1;
        int[] ans = new int[arr.length];
        ans[arr.length-1]=max;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans[i-1]=max;
            }else{
                ans[i-1]=max;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));//Output: [18,6,6,6,1,-1]
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));//Output: [-1]
    }
}
