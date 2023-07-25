package com.hari.leetcode;

import java.util.*;

/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.

 */
public class LuckyNumbersinaMatrix {

    static  public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> s = new HashSet<>();
        List<Integer> ans = new ArrayList<>();


        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }

            s.add(min);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            if (s.contains(max)) {
                ans.add(max);
                break;
            }
            s.add(max);
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));//Output: [15]
        System.out.println(luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));//Output: [12]
        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));//Output: [7]
    }
}
