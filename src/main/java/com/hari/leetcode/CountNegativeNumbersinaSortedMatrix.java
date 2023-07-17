package com.hari.leetcode;

/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
 */
public class CountNegativeNumbersinaSortedMatrix {

    static public int countNegatives(int[][] grid) {

        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));//Output: 8
        System.out.println(countNegatives(new int[][]{{3,2},{1,0}}));//Output: 0
    }
}
