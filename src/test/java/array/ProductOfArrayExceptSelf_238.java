package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ProductOfArrayExceptSelf_238 {
   // https://leetcode.com/problems/product-of-array-except-self/
    //Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    //The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    //You must write an algorithm that runs in O(n) time and without using the division operation.
    //
    //Example 1:
    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]
    //
    //Example 2:
    //Input: nums = [-1,1,0,-3,3]
    //Output: [0,0,9,0,0]

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] productExceptSelf(int[] nums) { //1ms 100% beats
        int[] res = new int[nums.length];
        res[0]=1;
        for(int i=1; i<nums.length; i++){
            res[i]=nums[i-1] * res[i-1];
        }
        int r =1;
        for(int i=nums.length-1; i>=0; i--){
            res[i] = res[i] * r;
            r = r * nums[i];
        }
        return res;
    }

    public static int[] productExceptSelf1(int[] nums) {//2ms 68%beats
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        left[0]=1;
        right[nums.length-1] = 1;

        for(int i=1; i<nums.length; i++){
            left[i]=nums[i-1] * left[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            right[i] = nums[i+1] * right[i+1];
        }

        for(int i=0; i<nums.length; i++){
            res[i]=left[i] * right[i];
        }
        return res;
    }

    /*public static void main(String[] args) {
        int[] nums = {0,0};//{1,2,3,4}; //{-1,1,0,-3,3};
        int[] output = new int[nums.length];

        int a=1;
*//*        for(int pointer=0; pointer<=nums.length-1; pointer++){//O[n^2]
            for(int i=0; i<=nums.length-1; i++){
                //p1
                //p2
                //p3
                //p4
                if(pointer==i && i!=nums.length-1){     // increase "i" and skip num
                    i++;
                }
                if(i!=pointer){                         // save num and multiply
                    int temp = nums[i];
                    a=a*temp;
                }
                // [0][0]=2  [0][1]=3  [0][2]=4  2*3*4=24
                // [1][0]=1  [1][1]=3  [1][2]=4  1*3*4=12
                // [2][0]=1  [2][1]=2  [2][2]=4  1*2*4=8
                // [3][0]=1  [3][1]=2  [3][2]=3  1*2*3=6
            }
            output[pointer] = a;
            a=1;
        }*//*

        int pointer = 0;
            for(int i=0; i<=nums.length-1; i++){
                //p1
                //p2
                //p3
                //p4
                if(pointer==i && i!=nums.length-1){    // increase "i" and skip num
                    i++;
                }
                if(i!=pointer){                         // save num and multiply
                    int temp = nums[i];
                    a=a*temp;
                }
                // [0][0]=2  [0][1]=3  [0][2]=4  2*3*4=24
                // [1][0]=1  [1][1]=3  [1][2]=4  1*3*4=12
                // [2][0]=1  [2][1]=2  [2][2]=4  1*2*4=8
                // [3][0]=1  [3][1]=2  [3][2]=3  1*2*3=6
                if(pointer<=nums.length-1 && i==nums.length-1){
                output[pointer] = Math.abs(a);
                a=1;
                pointer++;
                i=0;
                }
            }


        for(int num:output){//O(n)
            System.out.println(num);
        }
    }
*/
}
