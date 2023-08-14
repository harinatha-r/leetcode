package com.hari.leetcode;

import java.util.PriorityQueue;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 */
public class KthLargestElementinanArray {

    static public int findKthLargest(int[] nums, int k) {
        // solve using heap
        // pick min heap which store min element in root and remove if size is greater than k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        // top element would be kth element now
        return minHeap.remove();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));//Output: 5
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));//Output: 4
    }

}
