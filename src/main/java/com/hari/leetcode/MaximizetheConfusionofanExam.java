package com.hari.leetcode;
/*
A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).

You are given a string answerKey, where answerKey[i] is the original answer to the ith question. In addition, you are given an integer k, the maximum number of times you may perform the following operation:

Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.


Constraints:

n == answerKey.length
1 <= n <= 5 * 10^4
answerKey[i] is either 'T' or 'F'
1 <= k <= n
 */
public class MaximizetheConfusionofanExam {

    static  public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0, right = 0, Tcount = 0, Fcount = 0, max = 0, N = answerKey.length();
        while(right < N) {
            if(answerKey.charAt(right) == 'T')
                Tcount++;
            else
                Fcount++;

            if(Tcount <= k || Fcount <= k) {
                max=Math.max(max, (right-left+1));
            } else {
                if(answerKey.charAt(left) == 'T')
                    Tcount--;
                else
                    Fcount--;

                left++;
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("TTFF",2));//Output: 4
        System.out.println(maxConsecutiveAnswers("TFFT",1));//Output: 3
        System.out.println(maxConsecutiveAnswers("TTFTTFTT",1));//Output: 5
    }
}
