package com.hari.leetcode;

public class AddDigits {

    static public int addDigits(int num) {

        num = getSum(num);
        if(String.valueOf(num).length()>1){
            num = addDigits(num);
        }
        return num;
    }

    static private int getSum(int num){
        int sum = 0;
        while(num>0){
            sum += (num%10);
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
