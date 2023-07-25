package com.hari.leetcode;

import java.util.HashMap;

/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Constraints:

1 <= text.length <= 104
text consists of lower case English letters only.
 */
public class MaximumNumberofBalloons {

    static public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> map=new HashMap<>();
        String balloon="balon";

        for(char c:text.toCharArray()){
            if(balloon.contains(String.valueOf(c)))
                map.put(c, map.getOrDefault(c,0)+1);
        }

        if(null==map.get('b') || null==map.get('a') || null==map.get('n')
            || map.get('b')==0 || map.get('a')==0 || map.get('n')==0)
            return 0;

        int minVal = Math.min(Math.min(map.get('b'), map.get('a')),map.get('n'));

        if(null==map.get('l') || null==map.get('o')
                || map.get('l')==0 || map.get('o')==0)
            return 0;

        while(minVal>0){
            if(map.get('l')>=2*minVal && map.get('o')>=2*minVal){
                return minVal;
            } else {
                minVal--;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));//Output: 1
        System.out.println(maxNumberOfBalloons("laebolko"));//Output: 0
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));//Output: 2
        System.out.println(maxNumberOfBalloons("leetcode"));//Output: 0
    }
}
