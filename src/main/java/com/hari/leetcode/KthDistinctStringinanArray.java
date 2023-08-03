package com.hari.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

Constraints:

1 <= k <= arr.length <= 1000
1 <= arr[i].length <= 5
arr[i] consists of lowercase English letters.

 */
public class KthDistinctStringinanArray {

    static public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> map=new HashMap<>();

        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        int count=0;
        for(String s:arr){
            if(map.get(s)==1 && ++count==k){
                return s;
            }
        }

        return "";
    }
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"}, 2));//Output: "a"
        System.out.println(kthDistinct(new String[]{"aaa","aa","a"}, 1));//Output: "aaa"
        System.out.println(kthDistinct(new String[]{"a","b","a"}, 3));//Output: ""
    }
}
