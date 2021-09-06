package com.hari.leetcode;

public class PerfectNumber {


    static public boolean checkPerfectNumber(int num) {

        int i = 1, j = num/2;
        int sum = 0;

        while(i<=j){

            if(num%i==0)
                sum+=i;
            if(i!=j && num%j==0)
                sum+=j;

            if(sum>num)
                return false;

            i++;
            j--;
        }

        return sum==num;
    }


    /*
    static public boolean checkPerfectNumber(int num) {

        int j = num/2;
        int sum = 0;

        for(int i=1; i<=j; i++){

            if(num%i==0)
                sum+=i;

            if(sum>num)
                return false;
        }

        return sum==num;
    }
    */

    public static void main(String[] args) {

        System.out.println(checkPerfectNumber(2));
        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(496));
        System.out.println(checkPerfectNumber(8128));

    }
}
