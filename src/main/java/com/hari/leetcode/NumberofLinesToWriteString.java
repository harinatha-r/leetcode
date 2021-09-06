package com.hari.leetcode;

import java.util.HashMap;

public class NumberofLinesToWriteString {

    static public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int calcLineWidth = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char i='a'; i<='z'; i++){
            map.put(i, widths[(int) i-97]);
        }

        for(int i=0;i<s.length(); i++){
            calcLineWidth += map.get(s.charAt(i));
            if(calcLineWidth > 100){
                lines++;
                calcLineWidth = map.get(s.charAt(i));
            }
        }

        return new int[]{lines, calcLineWidth};
    }

    /* Performance: 0ms
    static public int[] numberOfLines(int[] widths, String s) {
        int line=1, width=0;
        for(char ch: s.toCharArray()){
            int w= widths[ch-'a'];
            width+=w;
            if(width>100){
                line++;
                width=w;
            }
        }
        return new int[]{line, width};
    }
     */

    public static void main(String[] args) {
        int[] res = numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println("res: " + res[0] + "," + res[1]);
        int[] res1 = numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
        System.out.println("res1: " + res1[0] + "," + res1[1]);
    }
}
