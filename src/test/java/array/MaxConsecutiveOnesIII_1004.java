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
        int[] nums = {0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1};
        int k = 3;

        //System.out.println(longestOnes(nums, k));
        System.out.println(longestOnes2(nums, k));
    }

    public static int longestOnes2(int[] nums, int k) {
        int left =0;
        int right =0;

        while(left<nums.length){
            if(nums[left] == 0) k--;
            if(k<0){
                if(nums[right] == 0){
                    k++;
                }
                right++;
            }
            left++;
        }
         return left-right;
    }

    public static int longestOnes(int[] nums, int k) {
        int currSum = 0;
        int counter = k;
        int max = 0;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && counter>0){
                counter--;
                System.out.println("counter " + counter);
                if(index==-1){
                    index = i;
                    System.out.println("index " + index);
                }
            }
            if(counter==0){
                     System.out.println("i - currSum " + i + " - " + currSum);
                currSum=i - currSum;
                     System.out.println("current Sum " + currSum);
                counter=k;
                     System.out.println("counter " + counter);
                max = Math.max(currSum, max);
                     System.out.println("max " + max);
                i = index;
                     System.out.println("i " + i);
                index = -1;
                    System.out.println("index " + index);
                    System.out.println("--------------------------------");
            }
        }

        return max+1;
    }
}
