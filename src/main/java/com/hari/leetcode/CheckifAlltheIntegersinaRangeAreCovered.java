package com.hari.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/*
You are given a 2D integer array ranges and two integers left and right. Each ranges[i] = [starti, endi] represents an inclusive interval between starti and endi.

Return true if each integer in the inclusive range [left, right] is covered by at least one interval in ranges. Return false otherwise.

An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.

Constraints:

1 <= ranges.length <= 50
1 <= starti <= endi <= 50
1 <= left <= right <= 50
 */
public class CheckifAlltheIntegersinaRangeAreCovered {

    static public boolean isCovered(int[][] ranges, int left, int right) {

        Set<Integer> all = new HashSet<>();
        for(int[] range : ranges) {
            for(int i = range[0]; i <= range[1]; i++) {
                all.add(i);
            }
        }

        for(int i = left; i <= right; i++) {
            if(!all.contains(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));//Output: true
        System.out.println(isCovered(new int[][]{{1, 10}, {10, 20}}, 21, 21));//Output: false
    }
}
