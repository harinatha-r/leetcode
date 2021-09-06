package com.hari.leetcode;

public class FindNumberswithEvenNumberofDigits {

    static public int findNumbers(int[] nums) {
        int count = 0;

        for(int i: nums){
            if(checkWhetherNumberHaveEvenCount(i))
                count++;
        }

        return count;
    }

    static private boolean checkWhetherNumberHaveEvenCount(int num){
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }

        return count%2==0 ? true: false;
    }

    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }
}
