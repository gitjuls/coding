package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;

public class HappyNumber_202 {
    //https://leetcode.com/problems/happy-number/
    //Write an algorithm to determine if a number n is happy.
    //A happy number is a number defined by the following process:
    //Starting with any positive integer, replace the number by the sum of the squares of its digits.
    //Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    //Those numbers for which this process ends in 1 are happy.
    //Return true if n is a happy number, and false if not.
    //
    //Example 1:
    //Input: n = 19
    //Output: true
    //Explanation:
    //1*1 + 9*9 = 82
    //8*8 + 2*2 = 68
    //6*6 + 8*8 = 100
    //1*1 + 0*0 + 0*0 = 1
    //
    //Example 2:
    //Input: n = 2
    //Output: false

    public static void main(String[] args) {
        int n = 19;
        HashSet<Integer> set = new HashSet<>();

        do {
            //find digits
            String str = String.valueOf(n);
            int[] arr = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = Integer.valueOf(String.valueOf(str.charAt(i)));
            }

            //find square of each digit
            //find sum
            int sum = 0;
            int[] sq = new int[arr.length];
            for (int i = 0; i < sq.length; i++) {
                sq[i] = (int) Math.pow(arr[i], 2);
                sum = Integer.sum(sq[i], sum);
            }

            //save sum, verify if sum exist -> break infinite loop
           // System.out.println(set);
            if(set.contains(sum))break;
            else{
                set.add(sum);
                n = sum;
            }
        } while (n != 1);

        boolean isTrue = n == 1 ? true : false;
        System.out.println(isTrue);

    }
}
