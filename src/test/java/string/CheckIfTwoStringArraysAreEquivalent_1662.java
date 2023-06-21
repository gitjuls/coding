package string;

public class CheckIfTwoStringArraysAreEquivalent_1662 {
    //Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
    //
    //A string is represented by an array if the array elements concatenated in order forms the string.
    //
    //
    //
    //Example 1:
    //
    //Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    //Output: true
    //Explanation:
    //word1 represents string "ab" + "c" -> "abc"
    //word2 represents string "a" + "bc" -> "abc"
    //The strings are the same, so return true.
    //Example 2:
    //
    //Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
    //Output: false
    //Example 3:
    //
    //Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
    //Output: true

    public static void main(String[] args) {
        String[] s1 = {"ab","c"};
        String[] s2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2 = "";
        if(s1.length()!=s2.length())return false;
        for(int i=0; i<word1.length; i++){
            s1+=word1[i];
            s2+=word2[i];
        }

        return s1.equalsIgnoreCase(s2)? true: false;
    }
}
