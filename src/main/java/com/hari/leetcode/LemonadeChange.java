package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {

    static public boolean lemonadeChange(int[] bills) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);

        for(int i=0; i<bills.length; i++){

            if(bills[i] == 5){
                map.put(5,map.get(5)+1);
            } else if(bills[i] == 10){
                if(map.get(5)>=1){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)+1);
                } else {
                    return false;
                }
            } else if(bills[i] == 20){
                if(map.get(10)>=1 && map.get(5)>=1){
                    map.put(10,map.get(10)-1);
                    map.put(5,map.get(5)-1);
                } else if(map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));//Output: true
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));//Output: false
    }
}
