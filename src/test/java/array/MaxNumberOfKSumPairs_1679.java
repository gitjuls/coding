package array;

import java.util.*;

public class MaxNumberOfKSumPairs_1679 {
    //You are given an integer array nums and an integer k.
    //In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
    //Return the maximum number of operations you can perform on the array.

    //Example 1:
    //Input: nums = [1,2,3,4], k = 5
    //Output: 2
    //Explanation: Starting with nums = [1,2,3,4]:
    //- Remove numbers 1 and 4, then nums = [2,3]
    //- Remove numbers 2 and 3, then nums = []
    //There are no more pairs that sum up to 5, hence a total of 2 operations.

    //Example 2:
    //Input: nums = [3,1,3,4,3], k = 6
    //Output: 1
    //Explanation: Starting with nums = [3,1,3,4,3]:
    //- Remove the first two 3's, then nums = [1,4,3]
    //There are no more pairs that sum up to 6, hence a total of 1 operation.

    public static void main(String[] args) {
        int[] nums ={3,1,3,4,3};//{63,10,28,31,90,53,75,77,72,47,45,6,49,13,77,61,68,43,33,1,14,62,55,55,38,54,8,79,89,14,50,68,85,12,42,57,4,67,75,6,71,8,61,26,11,20,22,3,70,52,82,70,67,18,66,79,84,51,78,23,19,84,46,61,63,73,80,61,15,12,58,3,21,66,42,55,7,58,85,60,23,69,41,61,35,64,58,84,61,77,45,14,1,38,4,8,42,16,79,60,80,39,67,10,24,15,6,37,68,76,30,53,63,87,11,71,86,82,77,76,37,21,85,7,75,83,80,8,19,25,11,10,41,66,70,14,23,74,33,76,35,89,68,85,83,57,6,72,34,21,57,72,79,29,65,3,67,8,24,24,18,26,27,68,78,64,57,55,68,28,9,11,38,45,61,37,81,89,38,43,45,26,84,62,22,37,51,15,30,67,75,24,66,40,81,74,48,43,78,14,33,19,73,5,1,2,53,29,49,73,23,5};
        int k = 6;//59; // ex 42
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        shellSort(nums);
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
                break;
            }
            len=i;
        }

        int left = 0, right = len, count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                left++;
                right--;
                count++;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }

    public static int maxOperations1(int[] nums, int k) {
        shellSort(nums);
        int len =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=k){
                break;
            }else{
                len=i+1;
            }
        }
        int counter =0;
        int left =0;
        int right =len-1;
        while(left<right) {
            if(nums[left] + nums[right] == k){
                counter++;
                left++;
                right--;
                continue;
            }
            boolean isLeft = false;
            boolean isRight = false;
            for (int mid = left+1; mid < len - (len-right); mid++) {
                if(nums[left] + nums[mid] == k && isLeft==false){
                    counter++;
                    nums[mid]=0;
                    isLeft = true;
                }else if(nums[right] + nums[mid] == k && isRight==false){
                    counter++;
                    nums[mid]=0;
                    isRight=true;
                }
            }
            left++;
            right--;
        }
        return counter;
    }

    public static void shellSort(int[] arr){
        for(int gap = arr.length/2; gap>0; gap/=2 ){
            for(int i=gap; i<arr.length; i++){
                int el= arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>el){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=el;
            }
        }
    }

    public static int maxOperations2(int[] nums, int k) {
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k){
                ll.add(nums[i]);
            }
        }

        int counter =0;
        while(ll.size()>1) {
            int left = ll.getFirst();
            int right = ll.getLast();
            ll.removeFirst();
            ll.removeLast();

            if (left + right == k) {
                counter++;
                continue;
            }

            boolean isLeft = false;
            boolean isRight = false;
            for (int mid = 0; mid < ll.size(); mid++) {
                if(left + ll.get(mid) == k && isLeft==false){
                    counter++;
                    ll.remove(mid);
                    isLeft=true;
                }else if(ll.get(mid) + right == k && isRight==false){
                    counter++;
                    ll.remove(mid);
                    isRight=true;
                }
            }
        }
        return counter;
    }

}

