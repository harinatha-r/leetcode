package com.hari.leetcode;

public class CheckIfItIsaStraightLine {

    static public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0]-coordinates[0][0];
        int dy = coordinates[1][1]-coordinates[0][1];

        for(int i =1; i<coordinates.length-1; i++)
            if(dx*(coordinates[i+1][1]-coordinates[i][1]) != dy*(coordinates[i+1][0]-coordinates[i][0]))
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }
}
