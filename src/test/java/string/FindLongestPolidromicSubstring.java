package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestPolidromicSubstring {
    //Given a string s, return the longest
    //palindromic substring in s.
    //Example 1:
    //
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: "bb"


    public static void main(String[] args) {
        String str = "babad";//"cbbd";
        String num = str.length()%2==0? "odd":"even";
        int left = 0;
        int right =0;
        int[] res = new int[2];

        if(num == "even"){
            int pointer = str.length()/2;
            left = pointer-1;
            right = pointer+1;
        }
        if(num == "odd"){
            left = str.length()/2-1;
            right = str.length()/2;
        }
        do{
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            if(leftChar==rightChar){
                res[0]=left;
                res[1]=right;
                left--;
                right++;
            }else{
                //split the string on a half and repeat steps for each substring
                break;
            }
        }while(left>=0);

        String output = str.substring(res[0], res[1]+1);
        System.out.println(output);

    }
}
