package com.hari.leetcode;

public class SubtracttheProductandSumofDigitsofanInteger {

    static public int subtractProductAndSum(int n) {

        int product = 1, sum = 0;

        while(n>0){
            int lastdigit = n%10;
            n=n/10;

            product *= lastdigit;
            sum += lastdigit;
        }

        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }
}
