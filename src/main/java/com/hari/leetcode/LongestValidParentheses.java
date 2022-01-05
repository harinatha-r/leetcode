package com.hari.leetcode;

import java.util.Stack;

public class LongestValidParentheses {

    static public int longestValidParentheses(String s) {

        if(s==null || s.isEmpty() || s.length()==1)
            return 0;

        int longest = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(i);
            } else {
                stk.pop();

                if(stk.size()!=0){
                    longest = Math.max(longest, i-stk.peek());
                } else{
                    stk.push(i);
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()("));//2
        System.out.println(longestValidParentheses("())"));//2
        System.out.println(longestValidParentheses(")()())"));//4
        System.out.println(longestValidParentheses("(())"));//4
        System.out.println(longestValidParentheses("()(())"));//6
        System.out.println("--------------------------------");
        System.out.println(longestValidParentheses("()((()"));//2
        System.out.println(longestValidParentheses("()))()"));//2
        System.out.println(longestValidParentheses("()(()()"));//4
        System.out.println(longestValidParentheses("())()()"));//4
        System.out.println("--------------------------------");
        System.out.println(longestValidParentheses("(()"));//2
        System.out.println(longestValidParentheses(")()"));//2
        System.out.println(longestValidParentheses(""));//0
        System.out.println(longestValidParentheses("("));//0
        System.out.println(longestValidParentheses("(()()"));//4
    }
}