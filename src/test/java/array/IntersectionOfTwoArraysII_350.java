package array;
import java.util.*;

public class IntersectionOfTwoArraysII_350 {
    //Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

    //Example 1:
    //Input: nums1 = [1,2,2,1], nums2 = [2,2]
    //Output: [2,2]

    //Example 2:
    //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    //Output: [4,9]
    //Explanation: [9,4] is also accepted.

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nuns2 = {9,4,9,8,4};
        int[] res = solution(nums1,nuns2);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] solution(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int e=0; e<nums2.length; e++){
                if(nums1[i]==nums2[e]){
                    list.add(nums2[e]);
                    nums2[e]='_';
                    break;
                }
            }
        }

        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i]=list.get(i);
        }

        return res;
    }
}
