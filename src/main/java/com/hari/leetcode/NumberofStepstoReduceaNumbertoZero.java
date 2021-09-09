package com.hari.leetcode;

public class NumberofStepstoReduceaNumbertoZero {

    static public int numberOfSteps(int num) {

        int count = 0;
        while(num>0){

            num = num % 2 == 0 ? num/2 : num-1;

            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }
}
