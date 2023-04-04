package array;

public class ProductOfArrayExceptSelf {
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
        int[] nums = {-1,1,0,-3,3};//{1,2,3,4};
        int[] output = new int[nums.length];

        int a=1;
        for(int pointer=0; pointer<=nums.length-1; pointer++){//O[n^2]
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
                // [0][0]=2  [0][1]=3  [0][2]=4
                // [1][0]=1  [1][1]=3  [1][2]=4
                // [2][0]=1  [2][1]=2  [2][2]=4
                // [3][0]=1  [3][1]=2  [3][2]=3
            }
            output[pointer] = a;
            a=1;
        }

        for(int i=0; i<=output.length-1; i++){//O(n)
            System.out.println(output[i]);
        }
    }

}
