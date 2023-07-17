package com.hari.leetcode;

import java.util.*;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Constraints:

0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
 */
public class LongestConsecutiveSequence {

    static public int longestConsecutive(int[] nums) {
        //Approach: Using HashSet, T.C:O(n), S.C: O(n)

        //initialize a set
        HashSet<Integer> s = new HashSet<>();
        //add elements to the set
        for(int num:nums){
            s.add(num);
        }
        //initialize the longest
        int longest = 0;

        //traverse
        for(int n:nums){
            /*if the index value-1 is not present in our set, that means
            that is may be the starting index of the sequence
            */
            if(!s.contains(n-1)){
                //initialize the length of the sequence
                int length = 0;
                //traverse and count how many values are consequtive
                while(s.contains(n+length)){
                    length+=1;
                }
                //find the max
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    /*
    //Time Limit Exceeded
    static public <set> int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;

        if(nums.length==1)
            return 1;

        int i=0, j=nums.length-1;
        Set<Integer> set=new TreeSet<>();

        while(i<=j){

            set.add(nums[i]);
            set.add(nums[j]);
            i++;
            j--;
        }

        int start= set.stream().min(Integer::compare).get();
        int end= set.stream().max(Integer::compare).get();

        int count=0, maxCount=0;
        for(int k=start;k<=end;k++){
            if(set.contains(k)) {
                count++;
            }
            else {
                maxCount = Math.max(maxCount, count);
                count=0;
            }

        }

        return Math.max(maxCount,count);
    }
    */

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));//Output: 7
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));//Output: 4
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));//Output: 9
        System.out.println(longestConsecutive(new int[]{1,0,-1}));//Output: 3
    }
}
