package string;

public class MergeStringsAlternately_1768 {
    //You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
    //If a string is longer than the other, append the additional letters onto the end of the merged string.
    //Return the merged string.

    //Example 1:
    //
    //Input: word1 = "abc", word2 = "pqr"
    //Output: "apbqcr"
    //Explanation: The merged string will be merged as so:
    //word1:  a   b   c
    //word2:    p   q   r
    //merged: a p b q c r

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqr";
        System.out.println(mergeAlternately(str1,str2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();

        int i=0;
        while(l1>0 && l2>0){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
            l1--;
            l2--;
        }

        if(l1!=0){
            while(l1>0) {
                sb.append(word1.charAt(i));
                i++;
                l1--;
            }
        }

        if(l2!=0){
            while(l2>0) {
                sb.append(word2.charAt(i));
                i++;
                l2--;
            }
        }
        return sb.toString();
    }

}
