package array;

public class SearchInsertPosition_35 {
    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //You must write an algorithm with O(log n) runtime complexity.
    //
    //Example 1:
    //Input: nums = [1,3,5,6], target = 5
    //Output: 2
    //
    //Example 2:
    //Input: nums = [1,3,5,6], target = 2
    //Output: 1
    //
    //Example 3:
    //Input: nums = [1,3,5,6], target = 7
    //Output: 4

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,8,9};//{3,6,7,8,10};//{1,3,5,6};
        int target = 11;//5;//7;
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if(target - nums[i] == 1){
                return i+1;
            }else if(nums[i]-target == 1){
                return i;
            }else if(nums[i] != target && nums[0] > target){
                return 0;
            }
        }

        return nums.length;
    }
}
