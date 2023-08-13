package string;

import java.util.HashMap;
import java.util.Map;

public class GreatestCommonDivisorOfStrings_1071 {
    //For two strings s and t, we say "t divides s" if
    // and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    //Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
    //
    //Example 1:
    //
    //Input: str1 = "ABCABC", str2 = "ABC"
    //Output: "ABC"
    //Example 2:
    //
    //Input: str1 = "ABABAB", str2 = "ABAB"
    //Output: "AB"
    //Example 3:
    //
    //Input: str1 = "LEET", str2 = "CODE"
    //Output: ""

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        //Euclidean algorithm
        //AB AB
        if(str2.equals(str1))return str1;
        //if true -> remove head and return the tail
        if(str1.startsWith(str2))return gcdOfStrings(str1.substring(str2.length()),str2);
        //reverse string to continue division
        if(str2.length()>str1.length())return gcdOfStrings(str2,str1);

        return "";
    }
}
