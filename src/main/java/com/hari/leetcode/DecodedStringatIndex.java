package com.hari.leetcode;

/*
You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
Given an integer k, return the kth letter (1-indexed) in the decoded string.

Constraints:

2 <= s.length <= 100
s consists of lowercase English letters and digits 2 through 9.
s starts with a letter.
1 <= k <= 10^9
It is guaranteed that k is less than or equal to the length of the decoded string.
The decoded string is guaranteed to have less than 2^63 letters.
 */
public class DecodedStringatIndex {

    static public String decodeAtIndex(String s, int k) {

        if(k==1)
            return String.valueOf(s.charAt(0));

        StringBuilder sb=new StringBuilder();
        int len=s.length();

        for(int i=0; i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                int j= s.charAt(i)-'0'-1;
                String s1=sb.toString();
                while(j>0){
                    sb.append(s1);
                    j--;
                }
            } else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);

        return sb.substring(k-1, k);
    }




    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3",10));//Output: "o"
        System.out.println(decodeAtIndex("ha22",5));//Output: "h"
        System.out.println(decodeAtIndex("a2345678999999999999999",1));//Output: "a"
    }
}
