package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
You are given a 0-indexed m x n binary matrix grid.

A 0-indexed m x n difference matrix diff is created with the following procedure:

Let the number of ones in the ith row be onesRowi.
Let the number of ones in the jth column be onesColj.
Let the number of zeros in the ith row be zerosRowi.
Let the number of zeros in the jth column be zerosColj.
diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
Return the difference matrix diff.

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 105
1 <= m * n <= 105
grid[i][j] is either 0 or 1.
 */
public class DifferenceBetweenOnesandZerosinRowandColumn {

    static public int[][] onesMinusZeros(int[][] grid) {

        int[] onesInRows = new int[grid.length];
        int[] zerosInRows = new int[grid.length];
        int[] onesInCols = new int[grid[0].length];
        int[] zerosInCols = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    onesInRows[i]++;
                    onesInCols[j]++;
                } else {
                    zerosInRows[i]++;
                    zerosInCols[j]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = onesInRows[i] + onesInCols[j] - zerosInRows[i] - zerosInCols[j];
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(onesMinusZeros(new int[][]{{0,1,1},{1,0,1},{0,0,1}})));//Output: [[0,0,4],[0,0,4],[-2,-2,2]]
        System.out.println(Arrays.toString(onesMinusZeros(new int[][]{{1,1,1},{1,1,1}})));//Output: [[5,5,5],[5,5,5]]
    }
}
