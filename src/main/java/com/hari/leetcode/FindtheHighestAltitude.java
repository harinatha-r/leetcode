package com.hari.leetcode;

import java.util.Arrays;

/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100

 */
public class FindtheHighestAltitude {
    static public int largestAltitude(int[] gain) {

        int[] altitudes = findAltitudes(gain);
        return Arrays.stream(altitudes).max().getAsInt();
    }

    static public int[] findAltitudes(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        altitudes[1] = gain[0];
        int j=2;
        for(int i=1;i<gain.length;i++){
            altitudes[j]=altitudes[j-1]+gain[i];
            j++;
        }
        return altitudes;
    }
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
