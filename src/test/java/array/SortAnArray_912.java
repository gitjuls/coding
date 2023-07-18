package array;

import java.util.*;
import java.util.stream.IntStream;

public class SortAnArray_912 {
    //Given an array of integers nums, sort the array in ascending order and return it.
    //You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

    //Example 1:
    //Input: nums = [5,2,3,1]
    //Output: [1,2,3,5]
    //Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

    //Example 2:
    //Input: nums = [5,1,1,2,0,0]
    //Output: [0,0,1,1,2,5]
    //Explanation: Note that the values of nums are not necessairly unique.
    public static void main(String[] args) {
        int[] arr ={0,4,5,3,7,8,9,23,45,78,90,1000,6,200,-4};
        int[] res = sortArray(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] sortArray(int[] nums) {
        int length = nums.length;
        if (length <= 1) return nums;

        if (length > 20) {
            //use merge sort
            int mid = Math.round(nums.length/2);
             int[] arr1=sortArray(Arrays.copyOfRange(nums,0,mid));
             int[] arr2=sortArray(Arrays.copyOfRange(nums,mid,nums.length));

            int[] result = new int[arr1.length + arr2.length];
            int i=0;
            int j=0;
            int e=0;
            while(i < arr1.length && j < arr2.length){
                if(arr2[j] > arr1[i]){
                    result[e]=arr1[i];
                    e++;
                    i++;
                }else if(arr2[j] < arr1[i]){
                    result[e] = arr2[j];
                    e++;
                    j++;
                }else if(arr2[j] == arr1[i]){
                    result[e]=arr1[i];
                    e++;i++;
                    result[e]=arr2[j];
                    e++;j++;
                }
            }

            while(i<arr1.length){
                result[e] = arr1[i];
                e++;
                i++;
            }
            while(j<arr2.length){
                result[e] = arr2[j];
                e++;
                j++;
            }
            return result;
        } else {
            //use bubble sort
            boolean noSwaps;
            for (int e = nums.length; e > 0; e--) {
                noSwaps = true;
                for (int i = 0; i < e - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        noSwaps = false;
                    }
                }
                if (noSwaps) break;
            }
        }
        return nums;
    }

}
