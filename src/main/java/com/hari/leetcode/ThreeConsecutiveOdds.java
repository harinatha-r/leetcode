package com.hari.leetcode;

public class ThreeConsecutiveOdds {

    static public boolean threeConsecutiveOdds(int[] arr) {

        if(arr.length<3)
            return false;

        int count = 0;

        for(int i: arr){
            if(i%2 != 0){
                count++;
            } else {
                count = 0;
            }

            if(count == 3)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }
}
