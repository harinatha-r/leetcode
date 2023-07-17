package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

Constraints:

1 <= n <= 1000
0 <= trust.length <= 104
trust[i].length == 2
All the pairs of trust are unique.
ai != bi
1 <= ai, bi <= n
 */
public class FindtheTownJudge {

    static public int findJudge(int n, int[][] trust) {
        if(n == 1)
            return 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] temp : trust){
            int x = temp[0];
            int y = temp[1];

            //make it's outdegree zero
            map.put(x, map.getOrDefault(x, 0) - 1);
            map.put(y, map.getOrDefault(y, 0) + 1);
        }

        for(int i = 1; i<=n; i++){
            int x = map.getOrDefault(i, 0);
            if(x == n- 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1,2}}));//Output: 2
        System.out.println(findJudge(3, new int[][]{{1,3},{2,3}}));//Output: 3
        System.out.println(findJudge(3, new int[][]{{1,2},{2,3},{3,1}}));//Output: 3
        System.out.println(findJudge(3, new int[][]{{1,2},{2,3}}));//Output: -1
    }
}
