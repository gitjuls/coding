package array;

import java.util.*;

public class MoveZeroes_283 {
    //Given an integer array nums,
    //move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.
    //
    //Example 1:
    //
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]
    //Example 2:
    //
    //Input: nums = [0]
    //Output: [0]
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,1,0,1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int l=0;
        for(int r=1; r<nums.length;r++){
            if(nums[l]==0 && nums[r]!=0){
               int temp = nums[l];
               nums[l]=nums[r];
               nums[r]=temp;
               l++;
            }else if(nums[l]!=0) {
                l++;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
    public static void moveZeroes1(int[] nums) {
        //create bucket of digits
        //return result

        Stack<Integer> bucket = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){//O(n)
            if(nums[i] != 0){
                bucket.push(nums[i]); // save it
                nums[i]=0;            // replace with 0
            }
        }

        //add digits first
        int bucketSize = bucket.size();
        for(int i=0; i<bucketSize; i++){//O(n)
            nums[i] = bucket.pop();    //place digits first, until bucket is not empty
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
