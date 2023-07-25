package com.hari.leetcode;

/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
 */
public class ConsecutiveCharacters {

    static public int maxPower(String s) {

        if(s.length()==1)
            return 1;

        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int j=i+1;
            int count=0;

            while(j<=s.length()-1){
                if(ch==s.charAt(j)){
                    count++;
                    j++;
                } else {
                    max=Math.max(max, count+1);
                    break;
                }
            }

            max=Math.max(max, count+1);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("cc"));//Output: 2
        System.out.println(maxPower("leetcode"));//Output: 2
        System.out.println(maxPower("abbcccddddeeeeedcba"));//Output: 5
    }
}
