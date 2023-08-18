package string;

import java.util.HashSet;

public class MaximumNumberOfVowelsInASubstringOfGivenLength_1456 {
    //Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
    //Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

    //Example 1:
    //Input: s = "abciiidef", k = 3
    //Output: 3
    //Explanation: The substring "iii" contains 3 vowel letters.

    //Example 2:
    //Input: s = "aeiou", k = 2
    //Output: 2
    //Explanation: Any substring of length 2 contains 2 vowels.

    //Example 3:
    //Input: s = "leetcode", k = 3
    //Output: 2
    //Explanation: "lee", "eet" and "ode" contain 2 vowels.

    public static void main(String[] args) {
        String s = "zpuerktejfp";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
       HashSet<Character> set = new HashSet<>();
       set.add('a');
       set.add('o');
       set.add('u');
       set.add('e');
       set.add('i');
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                max++;
            }
        }
        if (max == k) return max;
        int temp = max;
        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                temp++;
            }
            if (set.contains(s.charAt(i-k))) {
                temp--;
            }
            max = Math.max(temp, max);
            if (max == k) return max;
        }
        return max;
    }
}
