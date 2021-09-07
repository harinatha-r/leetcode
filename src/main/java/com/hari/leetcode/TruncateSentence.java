package com.hari.leetcode;

public class TruncateSentence {

    static public String truncateSentence(String s, int k) {

        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<k; i++){
            sb.append(arr[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }
}
