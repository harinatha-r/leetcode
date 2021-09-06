package com.hari.leetcode;

import javax.print.event.PrintEvent;

public class ReverseOnlyLetters {

    static public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=s.length()-1;

        while(i<j){
            if(!((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))) {
                i++;
                continue;
            }
            if(!((arr[j]>='a' && arr[j]<='z') || (arr[j]>='A' && arr[j]<='Z'))) {
                j--;
                continue;
            }
            if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') && (arr[j]>='a' && arr[j]<='z') || (arr[j]>='A' && arr[j]<='Z')){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters(";1yDV"));//";1VDy"
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));

//        Input: s = "ab-cd"
//        Output: "dc-ba"
//        Example 2:
//
//        Input: s = "a-bC-dEf-ghIj"
//        Output: "j-Ih-gfE-dCba"
//        Example 3:
//
//        Input: s = "Test1ng-Leet=code-Q!"
//        Output: "Qedo1ct-eeLg=ntse-T!"
    }
}
