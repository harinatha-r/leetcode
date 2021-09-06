package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestWordinDictionarythroughDeleting {

    static public String findLongestWord(String s, List<String> dictionary) {

        StringBuilder sb = new StringBuilder();
        String lenString = "";

        for(char c:s.toCharArray()){
            String temp = sb.append(c).toString();
            if(dictionary.contains(temp)){
                lenString = temp;
            } else {
                sb.delete(sb.length()-1, sb.length()-1);
            }

        }

        return lenString;
    }

    public static void main(String[] args) {

        System.out.println(findLongestWord("abpcplea",  new ArrayList<String>(Arrays.asList(new String[]{"ale", "apple", "monkey", "plea"}))));
        System.out.println(findLongestWord("abpcplea",  new ArrayList<String>(Arrays.asList(new String[]{"a","b","c"}))));
    }
}
