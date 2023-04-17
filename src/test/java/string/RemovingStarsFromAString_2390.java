package string;

public class RemovingStarsFromAString_2390 {
    //https://leetcode.com/problems/removing-stars-from-a-string/
    //You are given a string s, which contains stars *.
    //In one operation, you can:
    //Choose a star in s.
    //Remove the closest non-star character to its left, as well as remove the star itself.
    //Return the string after all stars have been removed.

    //Example 1:
    //Input: s = "leet**cod*e"
    //Output: "lecoe"
    //Explanation: Performing the removals from left to right:
    //- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
    //- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
    //- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
    //There are no more stars, so we return "lecoe".
    //
    //Example 2:
    //Input: s = "erase*****"
    //Output: ""
    //Explanation: The entire string is removed, so we return an empty string.

    public static void main(String[] args) {
        String str = "erase*****";//"leet**cod*e";
        StringBuilder sb = new StringBuilder(str);

        do{
            for (int i = 0, j = 1; j <= sb.length()-1; i++, j++) {
               if (sb.charAt(i) != '*' && sb.charAt(j) == '*') {
                   sb.deleteCharAt(j);
                   sb.deleteCharAt(i);
               }
            }
        }while(sb.chars().anyMatch(ch -> ch == '*')); //Runtime: 2 ms
        System.out.println(sb);
    }
}
