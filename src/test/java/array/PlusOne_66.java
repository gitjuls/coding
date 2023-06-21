package array;

import java.util.Arrays;

public class PlusOne_66 {
    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    //Increment the large integer by one and return the resulting array of digits.

    //Example 1:
    //Input: digits = [1,2,3]
    //Output: [1,2,4]
    //Explanation: The array represents the integer 123.
    //Incrementing by one gives 123 + 1 = 124.
    //Thus, the result should be [1,2,4].

    //Example 2:
    //Input: digits = [4,3,2,1]
    //Output: [4,3,2,2]
    //Explanation: The array represents the integer 4321.
    //Incrementing by one gives 4321 + 1 = 4322.
    //Thus, the result should be [4,3,2,2].

    //Example 3:
    //Input: digits = [9]
    //Output: [1,0]
    //Explanation: The array represents the integer 9.
    //Incrementing by one gives 9 + 1 = 10.
    //Thus, the result should be [1,0].

    public static void main(String[] args) {
        int[] digits = {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
        int[] res = plusOne(digits);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] plusOne(int[] digits) {
        //if last el in array less than 9
        //add 1 to the last el and return arr
        //if last el in arr equal 9
        //change 9 to 0 and add 1 if el != 9 and break;  499 -> 490 -> 400 -> 500  ||  99 -> 90 -> 00
        //if first el != 0 -> return 500
        //if first el == 0 -> create new arr and add 1 to the first el and return 100

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }else{
            for(int i=digits.length-1; i>=0; i--){
                if(digits[i]==9){
                    digits[i]=0;
                }else{
                    digits[i] = digits[i]+1;
                    break;
                }
            }
            if(digits[0]!=0){
                return digits;
            }
        }

        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
