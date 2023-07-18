package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddStrings_415 {
    //Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
    //
    //You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
    //You must also not convert the inputs to integers directly.
    //
    //Example 1:
    //
    //Input: num1 = "11", num2 = "123"
    //Output: "134"
    //Example 2:
    //
    //Input: num1 = "456", num2 = "77"
    //Output: "533"
    //Example 3:
    //
    //Input: num1 = "0", num2 = "0"
    //Output: "0"

    public static void main(String[] args) {
        String num1 = "584";
        String num2 = "18";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        //make num1 and num2 the same length
        if(num1.length()>num2.length()){
            int diff = num1.length() - num2.length();
            String temp="";
            for(int i=0; i<diff; i++){
                 temp+="0";
            }
            temp+=num2;
            num2=temp;
        }else if(num1.length()<num2.length()){
            int diff = num2.length() - num1.length();
            String temp="";
            for(int i=0; i<diff; i++){
                temp+="0";
            }
            temp+=num1;
            num1=temp;
        }

        String str = "";
        int first=0;
        int second =0;
        int sum =0;
        int carry =0;
        for(int i=num1.length()-1; i>=0; i--){
            first=num1.charAt(i)-'0';
            second=num2.charAt(i)-'0';
            sum=first+second+carry;
            carry=sum/10;
            str+=String.valueOf(sum%10);
        }

        if(carry!=0){
            str+=carry;
        }

        //reverse String
        String res ="";
        for(int i=str.length()-1; i>=0;i--){
            res+=str.charAt(i);
        }

        return res;
    }
}
