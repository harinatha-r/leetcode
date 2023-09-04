package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {

    static public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int count=0;

        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(nums.get(i)+nums.get(j)<target) count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new ArrayList<>(Arrays.asList(-1,1,2,3,1)), 2));//Output: 3
        System.out.println(countPairs(new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3)), -2));//Output: 10
    }
}
