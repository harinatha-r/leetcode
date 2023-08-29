package com.hari.leetcode;

/*
You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':

if the ith character is 'Y', it means that customers come at the ith hour
whereas 'N' indicates that no customers come at the ith hour.
If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:

For every hour when the shop is open and no customers come, the penalty increases by 1.
For every hour when the shop is closed and customers come, the penalty increases by 1.
Return the earliest hour at which the shop must be closed to incur a minimum penalty.

Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.


Constraints:

1 <= customers.length <= 10^5
customers consists only of characters 'Y' and 'N'.

 */
public class MinimumPenaltyforaShop {

    /*
        1. First we assume we close the shop at the 0th hour.
           Set bestTime = 0 and penaltyDiff = 0
        2. Iterate through customers, for the ith character:
            If customers[i] == 'Y', decrement penaltyDiff by 1. Otherwise, increment penaltyDiff by 1.
            If penaltyDiff < 0, set bestTime = i + 1 and penaltyDiff = 0
        3. Return bestTime after the iteration.
     */
    static public int bestClosingTime(String customers) {

        char[] chars = customers.toCharArray();
        int bestTime = 0, penaltyDiff = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'Y') penaltyDiff--;
            else penaltyDiff++;

            if (penaltyDiff < 0) {
                penaltyDiff = 0;
                bestTime = i + 1;
            }
        }
        return bestTime;
    }

    public static void main(String[] args) {
        System.out.println(bestClosingTime("YYNY"));//Output: 2
        System.out.println(bestClosingTime("NNNNN"));//Output: 0
        System.out.println(bestClosingTime("YYYY"));//Output: 4
    }
}
