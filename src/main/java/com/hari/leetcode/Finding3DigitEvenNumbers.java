package com.hari.leetcode;

import java.util.Arrays;
import java.util.TreeSet;

/*
You are given an integer array digits, where each element is a digit. The array may contain duplicates.

You need to find all the unique integers that follow the given requirements:

The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

Return a sorted array of the unique integers.

Constraints:

3 <= digits.length <= 100
0 <= digits[i] <= 9
 */
public class Finding3DigitEvenNumbers {

    static public int[] findEvenNumbers(int[] digits) {
        int N = digits.length;
        TreeSet<Integer> uniq = new TreeSet<>();
        for(int i = 0; i < N; i++)
        {
            if(digits[i] == 0)
                continue;
            for(int j = 0; j < N; j++)
            {
                if(i == j)
                    continue;
                for(int k = 0; k < N; k++)
                {
                    if(i == k || j == k || digits[k] % 2 != 0)
                        continue;
                    uniq.add(digits[i]*100+digits[j]*10+digits[k]);
                }
            }
        }

        int[] ret = new int[uniq.size()];
        int id = 0;
        for(int i : uniq)
            ret[id++] = i;
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2,1,3,0})));//Output: [102,120,130,132,210,230,302,310,312,320]
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2,2,8,8,2})));//Output: [222,228,282,288,822,828,882]
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{3,7,5})));//Output: []
    }
}
