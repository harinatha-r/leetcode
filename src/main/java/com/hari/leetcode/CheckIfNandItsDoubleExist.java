package com.hari.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfNandItsDoubleExist {

    static public boolean checkIfExist(int[] arr) {

        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]*2) || (arr[i]%2==0 && hm.containsKey(arr[i]/2))) return true;
            hm.put(arr[i],1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10,2,5,3}));
        System.out.println(checkIfExist(new int[]{7,1,14,11}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
        System.out.println(checkIfExist(new int[]{4,-7,11,4,18}));
        System.out.println(checkIfExist(new int[]{-10,12,-20,-8,15}));
    }
}
