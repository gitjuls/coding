package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestNiceSubstring_1763 {

    //A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.
    //Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.
    //
    //Example 1:
    //Input: s = "YazaAay"
    //Output: "aAa"
    //Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
    //"aAa" is the longest nice substring.

    //Example 2:
    //Input: s = "Bb"
    //Output: "Bb"
    //Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

    //Example 3:
    //Input: s = "c"
    //Output: ""
    //Explanation: There are no nice substrings.

    public static void main(String[] args) {
        String s = "YazaAay";  //
        System.out.println(longestNiceSubstring2(s));
    }

    public static String longestNiceSubstring2(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (charSet.contains(Character.toUpperCase(s.charAt(i))) &&
                    charSet.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        return s;
    }

    public static String longestNiceSubstring(String s) {
        HashSet<Integer> set = new HashSet<>();
        int right;
        for (int left = 0; left < s.length(); left++) {
            right = left;
            while (right != s.length()) {
                if ((int) s.charAt(left) == (int) s.charAt(right) - 32 || (int) s.charAt(left) - 32 == (int) s.charAt(right) && left != right) {
                    set.add(left);
                    set.add(right);
                }
                right++;
            }
        }

        Iterator it = set.iterator();
        int[] arr = new int[set.size()];
        int j = 0;
        while (it.hasNext()) {
            arr[j] = (int) it.next();
            j++;
        }


        int max = 0;
        int count = 0;
        int startingIndex = 0;
        for (int i = 0, e = 1; e < arr.length; i++, e++) {
            if (arr[e] - arr[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                startingIndex = arr[e];
                count = 0;
            }
        }

        String subS = s.substring(startingIndex, startingIndex + max + 1);

        for (int i = 0; i < subS.length(); i++) {
            char chToUp = subS.toUpperCase().charAt(i);
            char chToLow = subS.toLowerCase().charAt(i);
            if (!subS.contains(String.valueOf(chToUp)) || !subS.contains(String.valueOf(chToLow))) {
                max -= 1;
            }
        }

        return subS.substring(0, max + 1);
    }

}
