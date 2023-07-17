package com.hari.leetcode;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105

 */
public class Sum3 {

    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i = 0; i < nums.length-2; i++){
            int p1 = i+1;
            int p2 = nums.length-1;
            while(p1 < p2){
                int sum = nums[i]+nums[p1]+nums[p2];
                if(sum == 0){
                    ArrayList<Integer> sp = new ArrayList<>();
                    sp.add(nums[i]);
                    sp.add(nums[p1]);
                    sp.add(nums[p2]);

                    ans.add(sp);
                    p1++;
                }
                else if(sum < 0){
                    p1++;
                }
                else{
                    p2--;
                }
            }
        }
        return new ArrayList<>(ans);
    }

    /*
    //Time Limit Exceeded
    static public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i != j && j != k && k != i) {
                        if ((nums[i] + nums[j] + nums[k]) == 0) {
                            List<Integer> li = new ArrayList<>();
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[k]);

                            if (!set.contains(li)) {
                                set.add(li);
                                list.add(li);
                            }
                        }
                    }
                }
            }
        }

        return list;
    }
    */

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));//[[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(new int[]{0, 1, 1}));//[]
        System.out.println(threeSum(new int[]{0, 0, 0}));//[[0,0,0]]
    }
}
