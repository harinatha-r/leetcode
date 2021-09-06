package com.hari.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {

    //Better Time Complexity
    static public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) return false; //if strings don't have same length then return false
        Set<Character> set = new HashSet(); //put all characters in set
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        if (s.equals(goal)) { //if the strings are equal then set size should be less to be able to swap characters and make them equal for instance abc is not buddy string
            return set.size() < s.length();
        }
        int index1 = -1, index2 = -1; //find indexes having different character
        int count = 0; //count should be max 2 character to swap
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                count++;
                if (index1 == -1) index1 = i;
                else if (index2 == -1) index2 = i;
                if (count > 2) return false;
            }
        }
        if (count == 2) {
            return s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1); //try to swap the characters in index1 and index2 in both strings and if they are equal return true
        } else {
            return false; //if count is greater than 2 then return false
        }
    }


    //Simple solution
    /*static public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) return false;

        char[] charArrTemp = s.toCharArray();
        for(int i=0; i<s.length()-1; i++){

            for(int j=i+1; j<s.length(); j++){
                char temp = charArrTemp[i];
                charArrTemp[i] =  charArrTemp[j];
                charArrTemp[j] = temp;

                if(String.valueOf(charArrTemp).equals(goal)){
                    return true;
                } else {
                    temp = charArrTemp[i];
                    charArrTemp[i] =  charArrTemp[j];
                    charArrTemp[j] = temp;
                }
            }
        }

        return false;
    }
     */

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaabc"));
    }
}
