package com.hari.leetcode;

import java.util.StringTokenizer;

/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.


Constraints:

1 <= sentences.length <= 100
1 <= sentences[i].length <= 100
sentences[i] consists only of lowercase English letters and ' ' only.
sentences[i] does not have leading or trailing spaces.
All the words in sentences[i] are separated by a single space.

 */
public class MaximumNumberofWordsFoundinSentences {

    static public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String s:sentences)
            max=Math.max(max, new StringTokenizer(s).countTokens());


        return max;
    }
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));//Output: 6
        System.out.println(mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));//Output: 3
    }
}
