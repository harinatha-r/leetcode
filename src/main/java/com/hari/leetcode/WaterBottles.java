package com.hari.leetcode;

public class WaterBottles {
    static public int numWaterBottles(int numBottles, int numExchange) {

        if(numBottles<numExchange)
            return numBottles;

        int numOfBottleDrunk = numBottles;
        int emptyBottles = numBottles;

        int rem = 0, per = 0;
        while(emptyBottles>=numExchange){
            rem = emptyBottles/numExchange;
            per = emptyBottles%numExchange;
            emptyBottles = rem + per;
            numOfBottleDrunk = numOfBottleDrunk + rem;
        }

        return numOfBottleDrunk;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(5, 5)); //Output: 6
        System.out.println(numWaterBottles(9, 3)); //Output: 13
        System.out.println(numWaterBottles(15, 4)); //Output: 19

        System.out.println(numWaterBottles(2, 3)); //Output: 2
    }
}
