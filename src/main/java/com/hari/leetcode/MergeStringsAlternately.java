package com.hari.leetcode;

public class MergeStringsAlternately {

    static public String mergeAlternately(String word1, String word2) {

        int len = (word1.length()<word2.length())?word1.length():word2.length();

        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<len){
            sb.append(word1.charAt(i)).append(word2.charAt(i));

            i++;
        }

        if(word1.length()>len){
            sb.append(word1, len, word1.length());
        }

        if(word2.length()>len){
            sb.append(word2, len, word2.length());
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
