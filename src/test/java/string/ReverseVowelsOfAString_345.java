package string;

import java.util.HashSet;

public class ReverseVowelsOfAString_345 {
    //https://leetcode.com/problems/reverse-vowels-of-a-string/
    //Given a string s, reverse only all the vowels in the string and return it.
    //The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    //
    //Example 1:
    //Input: s = "hello"
    //Output: "holle"
    //
    //Example 2:
    //Input: s = "leetcode"
    //Output: "leotcede"


    public static void main(String[] args) {
        String s ="hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
            while(left<right){
                if(!set.contains(s.charAt(left))){
                    left++;
                }
                if(!set.contains(s.charAt(right))){
                    right--;
                }
                if(set.contains(s.charAt(left)) && set.contains(s.charAt(right))){
                    char templ = s.charAt(right);
                    char tempr = s.charAt(left);
                    sb.setCharAt(left,templ);
                    sb.setCharAt(right,tempr);
                    left++;
                    right--;
                }
            }
        return sb.toString();
    }
}
