package array;

import java.util.*;

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
        int[] nums = {3,2,4};
        int target = 6;

        int[] output = new int[2];
        output=twoSum(nums, target);
        Arrays.stream(output).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
       /* int[] n = new int[2];

        for(int i=0; i< nums.length ; i++){//O(n*m)
            for(int j=1; j<nums.length; j++){
                if(nums[i] + nums[j] == target && i!=j){
                    n[0]=j;
                    n[1]=i;
                    break;
                }
            }
        }
        return n;*/

        int[] n = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = target-nums[i];
            map.put(i,a);
        }

        return n;
    }

}
