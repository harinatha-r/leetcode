package com.hari.leetcode;

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

NOTE: You must write a solution in O(log(m * n)) time complexity.


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104

 */
public class Searcha2DMatrix {

    static public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][matrix[i].length-1]){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]==target)
                        return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int [][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));//Output: true
        System.out.println(searchMatrix(new int [][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13));//Output: true
    }
}
