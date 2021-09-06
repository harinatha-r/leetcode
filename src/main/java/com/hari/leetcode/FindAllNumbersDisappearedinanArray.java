package com.hari.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    static public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int[] tempArr = new int[nums.length+1];

        for (int i : nums)
            tempArr[i] = 1;


        for(int i=1;i<=nums.length; i++){
            if(tempArr[i] == 0){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
}
