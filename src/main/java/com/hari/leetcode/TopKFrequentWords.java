package com.hari.leetcode;

import java.util.*;

/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

Constraints:

1 <= words.length <= 500
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i]]


 */
public class TopKFrequentWords {

    static public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map=new HashMap<>();

        for(String s: words)
            map.put(s, map.getOrDefault(s, 0)+1);

        Queue<Map.Entry<String, Integer>> pq=new PriorityQueue<>((a,b)->(
                a.getValue()==b.getValue()?(a.getKey().compareToIgnoreCase(b.getKey()))
                :b.getValue()-a.getValue()));
        pq.addAll(map.entrySet());

        List<String> ans=new ArrayList<>();
        while(k-->0)
        {
            ans.add(pq.poll().getKey());
        }

        return ans;
    }
    /*
    static public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap<>();
        for (String s : words) {
            map.merge(s, 1, Integer::sum);
        }
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
     */
    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));//Output: ["i","love"]
        System.out.println(topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));//Output: ["the","is","sunny","day"]
    }
}
