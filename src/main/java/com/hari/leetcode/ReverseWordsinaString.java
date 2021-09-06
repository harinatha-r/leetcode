package com.hari.leetcode;

public class ReverseWordsinaString {

    static public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        s= s.replaceAll("\\s+"," ").trim();
        String[] arr = s.split(" ");

        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i].trim()).append(" ");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWords("  Bob    Loves  Alice   "));
        System.out.println(reverseWords("Alice does not even like bob"));
    }
}
