package com.hari.leetcode;

import sun.font.CStrike;

import java.util.HashMap;

public class MaximumNumberofWordsYouCanType {

    static public int canBeTypedWords(String text, String brokenLetters) {
        int count  = 0;
        HashMap<String, Boolean> map = new HashMap<>();
        String[] strArr = text.split(" ");

        for(int i=0; i<strArr.length; i++){
            if(map.containsKey(strArr[i]) && map.get(strArr[i])){
                count++;
            } else {
                if(map.containsKey(strArr[i]) && map.get(strArr[i]) == false){
                    continue;
                } else {
                    boolean cannotType = true;
                    for(char c : brokenLetters.toCharArray()){
                        if(strArr[i].contains(String.valueOf(c))){
                            cannotType =false;
                            break;
                        }
                    }

                    if(cannotType) {
                        map.put(strArr[i], true);
                        count++;
                    } else {
                        map.put(strArr[i], false);
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }
}
