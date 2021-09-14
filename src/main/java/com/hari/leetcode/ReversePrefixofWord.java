package com.hari.leetcode;

import java.util.Stack;

public class ReversePrefixofWord {

    //1ms & 75% faster
    static public String reversePrefix(String word, char ch) {

        if(!word.contains(String.valueOf(ch)))
            return word;

        int start=0, index = 0;
        char[] arr = word.toCharArray();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        while(start<index){

            char temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;

            start++;
            index--;
        }

        return String.valueOf(arr);
    }

    /*
    static public String reversePrefix(String word, char ch) {

        if(!word.contains(String.valueOf(ch)))
            return word;

        Stack<Character> stk = new Stack<>();
        char[] arr = word.toCharArray();
        int start=0, index = 0;

        for(int i=0; i<word.length(); i++){

            if(stk.isEmpty())
                stk.push(arr[i]);

            stk.push(arr[i]);

            if(arr[i] == ch){
                index = i;
                break;
            }
        }

        while(index>=start){
            arr[start] = stk.pop();
            start++;
        }

        return String.valueOf(arr);
    }
     */

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd')); //Output: "dcbaefd"
        System.out.println(reversePrefix("xyxzxe", 'z')); //Output: "zxyxxe"
        System.out.println(reversePrefix( "abcd", 'z')); //Output: "abcd"
    }
}
