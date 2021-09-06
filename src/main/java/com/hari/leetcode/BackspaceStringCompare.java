package com.hari.leetcode;

import java.util.Stack;

public class BackspaceStringCompare {

    static public boolean backspaceCompare(String s, String t) {

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stk1.isEmpty() && c == '#'){
                stk1.pop();
            } else if(c != '#') {
                stk1.push(c);
            }
        }

        for(char c: t.toCharArray()){
            if(!stk2.isEmpty() && c == '#'){
                stk2.pop();
            } else if(c != '#') {
                stk2.push(c);
            }
        }

        return stk1.equals(stk2);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("a#c", "b"));
    }
}
