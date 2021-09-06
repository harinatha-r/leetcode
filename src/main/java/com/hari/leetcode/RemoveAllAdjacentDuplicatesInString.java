package com.hari.leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {


    //Best Performance O(n)
    /*
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int idx = -1;

        for (char c : s.toCharArray())
            if (idx >= 0 && arr[idx] == c)
                idx--;
            else
                arr[++idx] = c;

        return String.valueOf(arr, 0, idx+1);
    }
    */


    static public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=s.length()-1;i>=0; i--){
            if(stack.empty()){
                stack.push(s.charAt(i));
            } else {
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("abbaca")); //Output: "ca"
        System.out.println(removeDuplicates("azxxzy")); //Output: "ay"
    }
}
