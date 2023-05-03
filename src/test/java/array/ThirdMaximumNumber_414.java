package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ThirdMaximumNumber_414 {
    //Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
    //
    //Example 1:
    //Input: nums = [3,2,1]
    //Output: 1
    //Explanation:
    //The first distinct maximum is 3.
    //The second distinct maximum is 2.
    //The third distinct maximum is 1.
    //
    //Example 2:
    //Input: nums = [1,2]
    //Output: 2
    //Explanation:
    //The first distinct maximum is 2.
    //The second distinct maximum is 1.
    //The third distinct maximum does not exist, so the maximum (2) is returned instead.
    //
    //Example 3:
    //Input: nums = [2,2,3,1]
    //Output: 1
    //Explanation:
    //The first distinct maximum is 3.
    //The second distinct maximum is 2 (both 2's are counted together since they have the same value).
    //The third distinct maximum is 1.

    public static void main(String[] args) {
        int[] nums = {1,2147483647,-2147483648};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        //find distinct numbers
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        //convert to arr
        int[] arr = new int[set.size()];
        Iterator it = set.iterator();
        int i=0;
        while (it.hasNext()){
            arr[i]= (int) it.next();
            i++;
        }

        //sort
        Arrays.sort(arr);

        //if length >=3 return third maximum
        //if length < 3 return first and only one maximum number from arr
        return arr.length>=3? arr[arr.length-3] : arr[arr.length-1];
    }
}
