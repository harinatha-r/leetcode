package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.



Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106
 */
public class CountNumberofDistinctIntegersAfterReverseOperations {

    static public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int i:nums){
            set.add(i);
            if(i>9){
                set.add(reverse(i));
            }
        }

        return set.size();
    }

    static int reverse(int n)
    {
        int rev = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(countDistinctIntegers(new int[]{1,13,10,12,31}));//Output: 6
        System.out.println(countDistinctIntegers(new int[]{2,2,2}));//Output: 1
    }
}
