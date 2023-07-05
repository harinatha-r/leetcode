package com.hari.leetcode;

import java.util.*;

/*
You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

Define a pair (u, v) which consists of one element from the first array and one element from the second array.

Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.


Constraints:

1 <= nums1.length, nums2.length <= 10^5
-10^9 <= nums1[i], nums2[i] <= 10^9
nums1 and nums2 both are sorted in ascending order.
1 <= k <= 10^4
 */
public class FindKPairswithSmallestSums {

    static public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> ((a[0] + a[1]) - (b[0] + b[1])));
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new int[] {nums1[i], nums2[0], 0});
        }

        while(k-- > 0 && !pq.isEmpty()) {
            int[] top = pq.poll();
            list.add(Arrays.asList(top[0], top[1]));
            int next = top[2] +  1;

            if(next < nums2.length) {
                pq.add(new int[] {top[0], nums2[next], next});
            }
        }

        return list;
    }
    public static void main(String[] args) {
        kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3);
        kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3}, 2);
        kSmallestPairs(new int[]{1,2}, new int[]{3}, 3);

        TreeMap<Integer, Integer> map = new TreeMap();
        map.put(1, 2);
        map.put(3, 5);
        map.put(2, 4);
        map.put(4, 3);
        map.put(5, 1);
        map.put(5, 2);
        System.out.println(map);
    }
}
