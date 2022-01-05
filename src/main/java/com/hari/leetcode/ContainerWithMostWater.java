package com.hari.leetcode;

public class ContainerWithMostWater {

    static public int maxArea(int[] height) {
        int i=0, j=height.length-1;
        int maxarea=0;
        while(i<j){

            int width = j-i;
            int container = 0;
            if(height[i]<height[j]) {
                container = height[i];
                i++;
            } else {
                container = height[j];
                j--;
            }

            maxarea = (maxarea<(container*width))?(container*width):maxarea;
        }
        return maxarea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{1}));
        System.out.println(maxArea(new int[]{9}));
        System.out.println(maxArea(new int[]{3,9,3,4,7,2,12,6}));
    }
}