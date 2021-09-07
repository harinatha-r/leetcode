package com.hari.leetcode;

public class SignoftheProductofanArray {

    static public int arraySign(int[] nums) {

        int negativeCount = 0;
        for(int i:nums){
            if(i==0)
                return 0;

            if(i<0)
                negativeCount++;
        }

        if(negativeCount%2!=0)
            return -1;

        return 1;
    }
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
        System.out.println(arraySign(new int[]{1,5,0,2,-3}));
        System.out.println(arraySign(new int[]{-1,1,-1,1,-1}));
        System.out.println(arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }
}
