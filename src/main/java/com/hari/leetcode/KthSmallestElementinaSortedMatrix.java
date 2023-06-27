package com.hari.leetcode;

import java.util.PriorityQueue;

/*
Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

You must find a solution with a memory complexity better than O(n2).

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 300
-109 <= matrix[i][j] <= 10^9
All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
1 <= k <= n^2
 */
public class KthSmallestElementinaSortedMatrix {

    static public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> p =new PriorityQueue<>((a, b)->b-a);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(p.size()<k){
                    p.add(matrix[i][j]);
                }
                else{
                    if(p.peek()>matrix[i][j]){
                        p.poll();
                        p.add(matrix[i][j]);
                    }
                }
            }
        }

        return p.peek();
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{{1,5,9},{10,11,13},{12,13,15}},8));
        System.out.println(kthSmallest(new int[][]{{-5}},1));
    }
}
