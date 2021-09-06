package com.hari.leetcode;

public class CheckIfStringIsaPrefixofArray {

    static public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder();
        for(String str: words){
            sb.append(str);

            if(s.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode",  new String[]{"i","love","leetcode","apples"}));
        System.out.println(isPrefixString("iloveleetcode",  new String[]{"apples","i","love","leetcode"}));
    }
}
