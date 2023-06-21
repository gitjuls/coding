package array;

import java.util.Arrays;

public class FindLuckyIntegerInAnArray_1394 {
    //Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
    //Return the largest lucky integer in the array. If there is no lucky integer return -1.
    //
    //Example 1:
    //Input: arr = [2,2,3,4]
    //Output: 2
    //Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

    //Example 2:
    //Input: arr = [1,2,2,3,3,3]
    //Output: 3
    //Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

    //Example 3:
    //Input: arr = [2,2,2,3,3]
    //Output: -1
    //Explanation: There are no lucky numbers in the array.

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3};
        System.out.println(findLucky(arr));
    }


    public static int findLucky(int[] arr) {
        //sort
        //take the last el and verify it with others,
        //if el equal with other el in array -> increase counter
        //if el not equal with other el in array -> take next el and start counting from beginning
        //if counter == el and  counter != next el -> return counter
        //if counter == el, and it's the end of the array -> return counter
        Arrays.sort(arr);
        int count =0;
        for(int i=arr.length-1, e=arr.length-1; i>=0; i--){
            if(arr[e] == arr[i]){
                count++;
            }else{
                e=i;
                count=1;
            }

            if(count==arr[e] && i>=1 && count!=arr[i-1] || count==arr[e] && i==0){
                return count;
            }
        }
        return -1;
    }
}
