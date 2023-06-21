package string;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitValue_2283 {
    //You are given a 0-indexed string num of length n consisting of digits.
    //Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

    //Example 1:
    //Input: num = "1210"
    //Output: true
    //Explanation:
    //num[0] = '1'. The digit 0 occurs once in num.
    //num[1] = '2'. The digit 1 occurs twice in num.
    //num[2] = '1'. The digit 2 occurs once in num.
    //num[3] = '0'. The digit 3 occurs zero times in num.
    //The condition holds true for every index in "1210", so return true.

    //Example 2:
    //Input: num = "030"
    //Output: false
    //Explanation:
    //num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
    //num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
    //num[2] = '0'. The digit 2 occurs zero times in num.
    //The indices 0 and 1 both violate the condition, so return false.


    public static void main(String[] args) {
        String s = "1210";
        System.out.println(digitCount(s));
    }

    public static boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int value =0;
        for(int key=0; key<num.length(); key++) {
            for (int i = 0; i < num.length(); i++) {
                int charFromStr = Integer.parseInt(String.valueOf(num.charAt(i)));
                if (key==charFromStr) {
                    value++;
                }
                if (i == num.length() - 1) {
                    map.put(key, value);
                    value =0;
                }
            }
        }

        String output = "";
        for(Integer i: map.values()){
            output+=i;
        }

        return output.equals(num);
    }
}
