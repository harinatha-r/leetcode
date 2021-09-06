package com.hari.leetcode;

import java.util.HashMap;

public class DecryptStringfromAlphabettoIntegerMapping {


    static public String freqAlphabets(String s) {
        HashMap<Integer, Character> map = new HashMap<>();
        int count = 1;
        for(char i='a'; i<='z'; i++){
            map.put(count, i);
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                sb =  sb.append(map.get(Integer.valueOf(s.substring(i-2, i))));
                i -= 2;
            } else {
                sb =  sb.append(map.get(Integer.valueOf(s.substring(i,i+1))));
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("25#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
