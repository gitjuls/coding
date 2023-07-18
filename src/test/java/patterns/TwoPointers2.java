package patterns;

import java.util.Arrays;

public class TwoPointers2 {
    public static void main(String[] args) {
        //return the array of unique numbers

        //array should to be sorted
        int[] arr = {1,1,1,2,2,3};
        int[] res = solution(arr);
        Arrays.stream(res).forEach(System.out::println);
    }
    public static int[] solution(int[] arr){
        //corner case if arr empty
        if(arr.length==0) return arr;

        int left=0;
        for(int right=1; right<arr.length; right++){
            if(arr[left]!=arr[right]){
                left++;
                arr[left]=arr[right];
            }
        }
        int[] res = new int[left+1];
        for(int i=0; i<res.length; i++){
            res[i]=arr[i];
        }
        return res;
    }
}
