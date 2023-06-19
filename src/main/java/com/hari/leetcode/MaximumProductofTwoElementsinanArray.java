package com.hari.leetcode;

/*
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

Constraints:
2 <= nums.length <= 500
1 <= nums[i] <= 10^3

 */
public class MaximumProductofTwoElementsinanArray {

    //Brute-Force Solution
    /*
   static  public int maxProduct(int[] nums) {
        int maxProduct=0;
       for(int i=0;i<nums.length-1;i++){

           for(int j=1;j<nums.length;j++){
               if(i!=j) {
                   maxProduct = Math.max(maxProduct, (nums[i] - 1) * (nums[j] - 1));
               }
           }
       }

       return maxProduct;
    }
    */

    static  public int maxProduct(int[] nums) {
        int firstMax=0, secMax=0;
        for(int i=0;i<nums.length;i++){
            if(firstMax<=nums[i]){
                secMax=firstMax;
                firstMax=nums[i];
            } else if (nums[i] > secMax && nums[i] != firstMax) {
                secMax = nums[i];
            }


        }
        System.out.println("firstMax: "+ firstMax + ", secMax: "+secMax);
        return (firstMax - 1) * (secMax - 1);
    }


    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));//Output: 12
        System.out.println(maxProduct(new int[]{1,5,4,5}));//Output: 16
        System.out.println(maxProduct(new int[]{3,7}));//Output: 12
        System.out.println(maxProduct(new int[]{10,2,5,2}));//Output: 36
    }
}
