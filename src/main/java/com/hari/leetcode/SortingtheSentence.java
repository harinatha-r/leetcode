package com.hari.leetcode;

public class SortingtheSentence {

    static public String sortSentence(String s) {

        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        String[] strArr = new String[str.length];

        for(String st: str){
            int i = Character.getNumericValue(st.charAt(st.length()-1))-1;
            strArr[i] = st.substring(0, st.length()-1);
        }

        for(String st: strArr){
            sb.append(st).append(" ");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
