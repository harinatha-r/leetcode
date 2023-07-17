package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

Constraints:

0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.
 */
public class NumberofSegmentsinaString {

    static public int countSegments(String s) {

        if(s.length()==0)
            return 0;

        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        list.removeAll(Arrays.asList("", null));
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));//Output: 5
        System.out.println(countSegments("Hello"));//Output: 1
        System.out.println(countSegments(", , , ,        a, eaefa"));//Output: 6
    }
}
