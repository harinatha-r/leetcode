package com.hari.leetcode;

public class PalindromeNumber {

    static public boolean isPalindrome(int x) {

        int rev = 0, temp = x;


        while(temp > 0)
        {
            int b = temp%10;
            temp/=10;
            rev = rev*10 + b;
        }

        if(rev == x)
           return true;
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-11));
    }
}
