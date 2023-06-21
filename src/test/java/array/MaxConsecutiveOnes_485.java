package array;

public class MaxConsecutiveOnes_485 {

    //Given a binary array nums, return the maximum number of consecutive 1's in the array.
    //Example 1:
    //Input: nums = [1,1,0,1,1,1]
    //Output: 3
    //Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

    //Example 2:
    //Input: nums = [1,0,1,1,0,1]
    //Output: 2

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes2(nums));
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        int l = 0;
        int max = 0;
        for(int r=1; r<nums.length; r++){
            if(nums[r]==0){
                max = Math.max(max, r-l);
                l = r+1;
            }
        }
        return max;
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                sum += nums[i];
            }else{
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
