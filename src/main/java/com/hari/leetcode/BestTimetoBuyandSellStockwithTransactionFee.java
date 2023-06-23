package com.hari.leetcode;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).


Constraints:

1 <= prices.length <= 5 * 10^4
1 <= prices[i] < 5 * 10^4
0 <= fee < 5 * 104
 */
public class BestTimetoBuyandSellStockwithTransactionFee {

    static public int maxProfit(int[] prices, int fee) {
        if(prices == null || prices.length <= 1)    return 0;

        // hold represents profit_so_far_if_we_buy
        int cash = 0;
        int hold = cash - prices[0];

        for(int i = 1; i < prices.length; i++)
        {
            cash = Math.max(cash, hold + prices[i] - fee);

            // can we make more profit, if we sell the previous stock somewhere before this point and buy the new stock now
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,2,8,4,9}, 2));//Output: 8
        System.out.println(maxProfit(new int[]{1,3,7,5,10,3}, 3));//Output: 6
    }
}
