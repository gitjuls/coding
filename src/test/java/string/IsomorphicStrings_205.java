package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings_205 {
    //Given two strings s and t, determine if they are isomorphic.
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character while preserving the order of characters.
    //No two characters may map to the same character, but a character may map to itself.
    //
    //Example 1:
    //Input: s = "egg", t = "add"
    //Output: true

    //Example 2:
    //Input: s = "foo", t = "bar"
    //Output: false

    //Example 3:
    //Input: s = "paper", t = "title"
    //Output: true

    public static void main(String[] args) {
        String s ="paper";
        String t ="title";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        //corner case
        if(s.length()!=t.length())return false;

        //compare character first and last index of both strings
        //if it's not equal return false
        for(int i=0; i<s.length(); i++){
            int leftIndexOfS = s.indexOf(s.charAt(i));
            int rightIndexOfS = s.lastIndexOf(s.charAt(i));

            int leftIndexOfT = t.indexOf(t.charAt(i));
            int rightIndexOfT = t.lastIndexOf(t.charAt(i));

            if(leftIndexOfS!=leftIndexOfT || rightIndexOfS!=rightIndexOfT){
                return false;
            }
        }
        return true;
    }
}
