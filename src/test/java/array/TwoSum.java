package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.
    //
    //Example 1:
    //
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //Example 2:
    //
    //Input: nums = [3,2,4], target = 6
    //Output: [1,2]
    //Example 3:
    //
    //Input: nums = [3,3], target = 6
    //Output: [0,1]

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 25;

        int[] output = new int[2];

        for(int i=0, e=1; i<=nums.length; i++, e++){//O[n]
           if(e<nums.length && Integer.sum(nums[i],nums[e]) == target){
                output[0]=i;
                output[1]=e;
                break;
            }
        }
        Arrays.stream(output).forEach(System.out::println);
    }

}
