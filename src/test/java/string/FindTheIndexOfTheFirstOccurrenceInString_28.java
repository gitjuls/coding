package string;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.*;

public class FindTheIndexOfTheFirstOccurrenceInString_28 {
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Example 1:
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.

//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.

    public static void main(String[] args) {
        String haystack = "sadbutsad"; //"leetcode";
        String needle = "sad";//"leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int output = -1;

        int len = needle.length();
        for(int i=0; i<haystack.length(); i++){
            if((haystack.length()-i) >= len) {
                //decrease haystack length by i, and verify if haystack length >= len
                //if 8-0>=3;  8-1>=3; 8-2>=3; ... 8-5>=3 true
                //if true, verify last occurrence and break;
                boolean isTrue = haystack.substring(i, len+i).equalsIgnoreCase(needle);
                //                sadbutsad        0   3+0 sad                sad
                //                                 1   3+1 adb
                //                                 2   3+2 dbu
                if(isTrue){output = i; break;}
                //find first occurrence and break;
            }
        }
        return output;
    }
}
