package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    static public int[][] merge(int[][] intervals) {
        // sort the array based on the start of interval
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> li = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] <= end) {
                // case for overlap
                end = Math.max(end, intervals[i][1]);
            } else {
                // add the non overlapping range to out
                li.add(new int[]{ start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // add the remaining range in the start and end to out
        li.add(new int[]{ start, end });

        // conver the out list to array and return
        return li.toArray(new int[li.size()][]);
    }

    public static void print2D(int[][] mat)
    {
        System.out.println(Arrays.deepToString(mat));
    }

    public static void main(String[] args) {
        print2D(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));//Output: [[1,6],[8,10],[15,18]]
        print2D(merge(new int[][]{{1,4},{4,5}}));//Output: [[1,5]]
    }
}
