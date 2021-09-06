package com.hari.leetcode;

public class ShuffleString {



    static public String restoreString(String s, int[] indices) {

        char[] arr = new char[s.length()];

        for(int i=0; i<indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        System.out.println(restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3})); //Output: "leetcode"
        System.out.println(restoreString("abc", new int[] {0,1,2})); //Output: "abc"
        System.out.println(restoreString("aiohn", new int[] {3,1,4,2,0}));//Output: "nihao"
        System.out.println(restoreString("aaiougrt", new int[] {4,0,2,6,7,3,1,5}));//Output: "arigatou"
        System.out.println(restoreString("art", new int[] {1,0,2}));//Output: "rat"
    }
}
