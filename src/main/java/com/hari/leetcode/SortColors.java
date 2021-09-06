package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortColors {

    static public void sortColors(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int j=0;

        for(int i=0; i<=2; i++){
            if(map.containsKey(i)){
                int k = 0;
                for(k=j; k<j+map.get(i); k++){
                    nums[k] = i;
                }
                j=k;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
        sortColors(new int[]{2,0,1});
        sortColors(new int[]{0});
        sortColors(new int[]{1});
    }
}
