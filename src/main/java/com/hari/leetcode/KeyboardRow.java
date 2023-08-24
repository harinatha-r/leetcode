package com.hari.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".


Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).
 */
public class KeyboardRow {

    static public String[] findWords(String[] words) {

        List<String> li=new ArrayList<>();
        for(String s:words){
            if(checkIfCharactersAreFromSameRow(s))
                li.add(s);
        }

        return li.stream().toArray(String[] :: new);
    }

    static private boolean checkIfCharactersAreFromSameRow(String s){
        String column1="qwertyuiop";
        String column2="asdfghjkl";
        String column3="zxcvbnm";

        int column=0;
        for(char c:s.toCharArray()) {
            if (column1.contains(String.valueOf(c)) || column1.contains(String.valueOf(Character.toLowerCase(c)))) {
                if(column==0 || column==1)
                    column=1;
                else
                    return false;
            } else if (column2.contains(String.valueOf(c)) || column2.contains(String.valueOf(Character.toLowerCase(c)))) {
                if(column==0 || column==2)
                    column=2;
                else
                    return false;
            } else if (column3.contains(String.valueOf(c)) || column3.contains(String.valueOf(Character.toLowerCase(c)))) {
                if(column==0 || column==3)
                    column=3;
                else
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
    }
}
