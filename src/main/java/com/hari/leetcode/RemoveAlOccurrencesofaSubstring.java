package com.hari.leetcode;

public class RemoveAlOccurrencesofaSubstring {

    static public String removeOccurrences(String s, String part) {

        while(s.contains(part)){
            s=s.substring(0,s.indexOf(part))+s.substring(s.indexOf(part)+part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("aabababa","aba"));
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
        System.out.println(removeOccurrences("axxxxyyyyb","xy"));
    }
}
