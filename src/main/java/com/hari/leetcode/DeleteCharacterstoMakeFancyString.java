package com.hari.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class DeleteCharacterstoMakeFancyString {

    static public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        int count = 0;

        for(int i=s.length()-1;i>=0; i--){

            if(stk.isEmpty()){
                stk.push(s.charAt(i));
                count++;
            } else if(stk.peek() == s.charAt(i)){
                count++;
                stk.push(s.charAt(i));
            } else {
                stk.push(s.charAt(i));
                count = 1;
            }

            if(count == 3){
                stk.pop();
                count -= 1;
            }

        }

        while(!stk.isEmpty())
            sb.append(stk.pop());

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aaaabaaaa"));
        System.out.println(makeFancyString("aaaabaaaa"));
        System.out.println(makeFancyString("aab"));
    }
}
