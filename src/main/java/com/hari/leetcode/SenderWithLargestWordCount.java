package com.hari.leetcode;

import java.util.*;

/*
You have a chat log of n messages. You are given two string arrays messages and senders where messages[i] is a message sent by senders[i].

A message is list of words that are separated by a single space with no leading or trailing spaces. The word count of a sender is the total number of words sent by the sender. Note that a sender may send more than one message.

Return the sender with the largest word count. If there is more than one sender with the largest word count, return the one with the lexicographically largest name.

Note:

Uppercase letters come before lowercase letters in lexicographical order.
"Alice" and "alice" are distinct.


Constraints:

n == messages.length == senders.length
1 <= n <= 10^4
1 <= messages[i].length <= 100
1 <= senders[i].length <= 10
messages[i] consists of uppercase and lowercase English letters and ' '.
All the words in messages[i] are separated by a single space.
messages[i] does not have leading or trailing spaces.
senders[i] consists of uppercase and lowercase English letters only.
 */
public class SenderWithLargestWordCount {

    static public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map=new HashMap<>();

        int max=0;
        String name="";
        int n=senders.length;

        for(int i=0;i<n;i++){
            map.put(senders[i], map.getOrDefault(senders[i],0)+messages[i].split(" ").length);

            if(map.get(senders[i])>max){
                max=map.get(senders[i]);
                name=senders[i];
            }
            else if(map.get(senders[i])==max && name.compareTo(senders[i])<0){
                name=senders[i];
            }
        }

        return name;
    }

    public static void main(String[] args) {
        System.out.println(largestWordCount(new String[]{"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"},new String[]{"Alice","userTwo","userThree","Alice"}));//Output: "Alice"
        System.out.println(largestWordCount(new String[]{"How is leetcode for everyone","Leetcode is useful for practice"},new String[]{"Bob","Charlie"}));//Output: "Charlie"
    }
}
