package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.


Constraints:

1 <= nums.length <= 2000
0 <= nums[i] <= 105
 */
public class MostFrequentEvenElement {

    /*
    static public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int max=-1;
        int res=Integer.MAX_VALUE;

        for (int i : nums) {
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);

                if (map.get(i) > max) {                 //Check if greater than Max Val
                    max = Math.max(max, map.get(i));
                    res = i;
                } else if (map.get(i) == max && res > i) {  //Check if equals to Max Val and element is less than current res
                    res = i;
                }
            }
        }

        return res==Integer.MAX_VALUE? -1: res;
    }
    */

    static public int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        int ans = 1;
        for(int i : nums){
            if(i % 2 == 0){
                arr[i]++;
                if ( (arr[ans] < arr[i]) || (arr[ans] == arr[i] && ans > i) ){
                    ans = i;
                }
            }
        }
        return ans == 1 ? -1 : ans;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
    }
}
