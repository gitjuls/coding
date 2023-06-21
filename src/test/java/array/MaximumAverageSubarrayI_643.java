package array;

public class MaximumAverageSubarrayI_643 {
    public static void main(String[] args) {
        int[] arr = {4,0,4,3,3};
        int k = 5;
        double res = findMaxAverage(arr, k);
        System.out.println(res);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k; i<nums.length; i++){
            sum= sum+nums[i]-nums[i-k];
            max = Math.max(max, sum);
        }

        return max/k;
    }
}
