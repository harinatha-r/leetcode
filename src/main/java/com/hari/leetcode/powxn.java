package com.hari.leetcode;

public class powxn {

    static public double myPow(double x, int n) {

        if (n==0) return 1;
        else if (n%2==0) return myPow(x*x, n/2);
        else if (n%2==1) return x*myPow(x, n-1);
        return 1/myPow(x, -n);
    }


    /*
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
     */

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));//Output: 1024.00000
        System.out.println(myPow(2.10000, 3));//Output: 9.26100
        System.out.println(myPow(2.00000, -2));//Output: 0.25000
    }
}
