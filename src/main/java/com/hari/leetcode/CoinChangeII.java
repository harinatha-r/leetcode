package com.hari.leetcode;

/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.

You may assume that you have an infinite number of each kind of coin.

The answer is guaranteed to fit into a signed 32-bit integer.

Constraints:

1 <= coins.length <= 300
1 <= coins[i] <= 5000
All the values of coins are unique.
0 <= amount <= 5000
 */
public class CoinChangeII {

    static public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = 1; j <= amount; j++) {
                if(coins[i] <= j) {
                    dp[j] = dp[j] + dp[j - coins[i]];
                }
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        System.out.println(change(5, new int[]{1,2,5}));//Output: 4
        System.out.println(change(3, new int[]{2}));//Output: 0
        System.out.println(change(10, new int[]{10}));//Output: 1
    }
}
