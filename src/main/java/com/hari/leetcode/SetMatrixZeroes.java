package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.


Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-2^31 <= matrix[i][j] <= 2^31 - 1


Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

 */
public class SetMatrixZeroes {

    /*
    static public void setZeroes(int[][] matrix) {

        Set<Integer> setRow=new HashSet<>();
        Set<Integer> setCol=new HashSet<>();
        int m=matrix.length, n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(setRow.contains(i) || setCol.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
    */


    static public void setZeroes(int[][] matrix) {

        Set<Integer> setRow=new HashSet<>();
        Set<Integer> setCol=new HashSet<>();
        int m=matrix.length, n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            if(setRow.contains(i)){
                for(int j=0; j<matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
            else{
                for(int j=0; j<matrix[0].length; j++){
                    if(setCol.contains(j)){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
