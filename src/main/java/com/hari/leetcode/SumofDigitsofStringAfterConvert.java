package com.hari.leetcode;

import java.util.HashMap;

public class SumofDigitsofStringAfterConvert {

    static HashMap<Character, Integer> map = new HashMap<>();

    static{
        int num = 1;
        for(char i='a'; i<='z'; i++){
            map.put(i, num);
            num++;
        }
    }
    static public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(map.get(c));
        }

        String s1 = sb.toString();

        while(k>0){
            int sum = 0;
            int i=0;
            while(i<s1.length()){
                sum += Integer.parseInt(String.valueOf(s1.charAt(i)));
                i++;
            }

            s1 = String.valueOf(sum);
            k--;

            if(k==0)
                return sum;
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1));
        System.out.println(getLucky("leetcode",2));
        System.out.println(getLucky("zbax",2));
    }
}
