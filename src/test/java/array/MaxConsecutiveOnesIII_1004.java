package array;

import java.util.Arrays;

public class MaxConsecutiveOnesIII_1004 {
    //Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    //
    //Example 1:
    //Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    //Output: 6
    //Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    //Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

    //Example 2:
    //Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
    //Output: 10
    //Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
    //Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        if(nums.length==k)return k;
        int max=0;
        int temp =0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]==0){
                temp++;
            }
            while(temp>k){
                if(nums[l]==0){
                    temp--;
                }
                l++;
            }
            max=Math.max(r-l+1, max);
           r++;
        }
        return max;
    }
}
