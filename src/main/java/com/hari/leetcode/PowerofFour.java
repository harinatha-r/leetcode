package com.hari.leetcode;

public class PowerofFour {

    static public boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(20));
        System.out.println(isPowerOfFour(16));
    }
}
