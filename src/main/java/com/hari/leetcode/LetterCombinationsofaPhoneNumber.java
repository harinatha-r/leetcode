package com.hari.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinationsofaPhoneNumber {

    static HashMap<Character, String> ph;
    public static List<String> letterCombinations(String digits) {
        ph = new HashMap<>();
        List<String> result = new LinkedList<>();
        if(digits.length() == 0)return result;
        ph.put('2', "abc");
        ph.put('3', "def");
        ph.put('4', "ghi");
        ph.put('5', "jkl");
        ph.put('6', "mno");
        ph.put('7', "pqrs");
        ph.put('8', "tuv");
        ph.put('9', "wxyz");
        combination(result, "", digits, 0);
        return result;

    }

    static private void combination(List<String> res, String ans, String digits, int pos){

        if(ans.length() == digits.length()){
            res.add(ans);
            return;
        }
        char digit = digits.charAt(pos);
        //skip if digit is 1 or 0
        if(digit == '1' || digit == '0') combination(res, ans, digits, pos +1);
            //pick if digit not 1 and 0
        else {
            String opt = ph.get(digit);
            int size = opt.length();
            for(int i = 0; i < size; i++)
                combination(res, ans + opt.charAt(i), digits, pos+1);

        }
    }
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(letterCombinations(""));//Output: []
        System.out.println(letterCombinations("2"));//Output: ["a","b","c"]
    }
}
