package com.hari.leetcode;

/*
You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.

1 <= n <= 200
 */
public class CountofMatchesinTournament {

    static public int numberOfMatches(int n) {

        int res = 0;
        while (n > 1) {
            res+=n/2;
            n=(n/2)+(n%2);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));//Output: 6
        System.out.println(numberOfMatches(14));//Output: 13
    }
}
