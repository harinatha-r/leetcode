package com.hari.leetcode;

/*
You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:

The frequency of a letter x is the number of times it occurs in the string.
You must remove exactly one letter and cannot chose to do nothing.


Constraints:

2 <= word.length <= 100
word consists of lowercase English letters only.

 */
public class RemoveLetterToEqualizeFrequency {

    static public boolean equalFrequency(String word) {
        int ch[]=new int[26];
        for(int i=0;i<word.length();i++){
            ch[word.charAt(i)-'a']++;
        }

        int n= word.length();
        if(n==2)
            return true;
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                ch[i]--;
                if(check(ch))
                    return true;
                ch[i]++;
            }
        }
        return false;
    }
    static public boolean check(int ch[]){
        int v=0, ans=0;
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                if(v==0){
                    ans=ch[i];
                    v=1;
                }else if(ans!=ch[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(equalFrequency("abcc"));//Output: true
        System.out.println(equalFrequency("aazz"));//Output: false
    }
}
