package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.

    //Example 1:
    //Input: nums = [3,0,1]
    //Output: 2
    //Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
    // 2 is the missing number in the range since it does not appear in nums.
    //
    //Example 2:
    //Input: nums = [0,1]
    //Output: 2
    //Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
    // 2 is the missing number in the range since it does not appear in nums.
    //
    //Example 3:
    //Input: nums = [9,6,4,2,3,5,7,0,1]
    //Output: 8
    //Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
    // 8 is the missing number in the range since it does not appear in nums.

    public static void main(String[] args) {
        int[] arr = {3,0,1};//{9,6,4,2,3,5,7,0,1};//{0,1};
        Arrays.sort(arr);

        int res = 0;
        for(int i=0, e=1; e<arr.length; i++, e++){ //O(n)
            boolean isTrue = arr[e] - arr[i] != 1;
            if(isTrue){
               res = arr[i]+1;       //save missing num
            }else{
                res = arr[e]+1;     //if no missing num => save last num + 1
            }
        }
        System.out.println(res);
    }

}