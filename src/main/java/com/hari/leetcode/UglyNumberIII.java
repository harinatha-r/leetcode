package com.hari.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
An ugly number is a positive integer that is divisible by a, b, or c.

Given four integers n, a, b, and c, return the nth ugly number.
 */
public class UglyNumberIII {

    public int nthUglyNumber(int n, int a, int b, int c) {
        long low = 1, high = Integer.MAX_VALUE;
        long ab = lcm(a, b), ac = lcm(a, c), bc = lcm(b, c), abc = lcm(a, bc);

        while (low < high) {
            long mid = (low + high) / 2;
            long count = mid/a + mid/b + mid/c - mid/ab - mid/ac - mid/bc + mid/abc;
            if (count < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int)low;
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(new UglyNumberIII().nthUglyNumber(3, 2, 3, 5));//Output: 4
        System.out.println(new UglyNumberIII().nthUglyNumber(4, 2, 3, 4));//Output: 6
        System.out.println(new UglyNumberIII().nthUglyNumber(5, 2, 11, 13));//Output: 10
    }
}
