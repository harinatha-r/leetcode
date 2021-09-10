package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MinimumIndexSumofTwoLists {

    static public String[] findRestaurant(String[] list1, String[] list2) {

        HashSet<String> set = new HashSet<>(Arrays.asList(list1));
        List<String> li = new ArrayList<>();

        for(String st:list2){
            if(set.contains(st))
                li.add(st);
        }

        return li.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})));
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[] {"KFC","Burger King","Tapioca Express","Shogun"})));
    }
}
