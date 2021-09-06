package com.hari.leetcode;

import java.util.HashSet;

public class CheckiftheSentenceIsPangram {

    /*
    static public boolean checkIfPangram(String sentence) {

        int count = 0;
        for(char i='a'; i<='z'; i++){
            if(sentence.contains(String.valueOf(i))){
                count++;
            }

            if(count == 26){
                return true;
            }
        }
        return false;
    }
    */


    //2ms & Better than 93%
    static public boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet<>();
        for(char c: sentence.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }

            if(set.size() == 26){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }
}
