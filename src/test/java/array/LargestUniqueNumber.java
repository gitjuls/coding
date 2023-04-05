package array;

import java.util.*;

public class LargestUniqueNumber {
    //Given an integer array nums, return the largest integer that only occurs once.
    //If no integer occurs once, return -1

    public static void main(String[] args) {
        int[] nums = {5,7,3,9,4,9,8,3,1}; //{9,9,8,8};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<=nums.length-1; i++){ //O(n)
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int max = -1;
        for(int i=0; i<=nums.length-1;i++){ //O(n)
            if(map.get(nums[i]) == 1){
                max = Math.max(max, nums[i]);
            }
        }
        System.out.println(max);
    }
}
