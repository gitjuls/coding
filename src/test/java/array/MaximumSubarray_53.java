package array;

public class MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
       // System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));
    }

    //brute force
    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int k = 1;
        int currentMax =nums[0];
        int max = nums[0];
        do{
            int sum=0;
            for(int i=0; i<k; i++){
                sum+=nums[i];
            }
            max=currentMax;
            currentMax=sum;
            for(int i=k; i<nums.length; i++){
                sum= sum+nums[i]-nums[i-k];
                currentMax = Math.max(currentMax, sum);
            }
            currentMax = Math.max(max,currentMax);
            k++;
        }while(k<=nums.length);

        return currentMax;
    }

    //Kadane's Algorithm - Maximum Subarray (Dynamic Programming)
    public static int maxSubArray2(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i -1]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
