package com.hari.leetcode;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {

    static public int isPrefixOfWord(String sentence, String searchWord) {

        String arr[] = sentence.split(" ");

        for(int i=0; i<arr.length; i++){

            if(searchWord.length()<=arr[i].length()) {
                String subStr = arr[i].substring(0,searchWord.length());
                if (subStr.equals(searchWord)) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(isPrefixOfWord("i use triple pillow", "pill"));
        System.out.println(isPrefixOfWord("hello from the other side", "they"));
    }
}
