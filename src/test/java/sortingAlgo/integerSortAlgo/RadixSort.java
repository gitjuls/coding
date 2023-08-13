package sortingAlgo.integerSortAlgo;

import java.util.*;

public class RadixSort {

    public static void main(String[] args) {
        int[] num = {34,22,1,3,3,4565,2323,10,11,4465,5565,99999,111111,34387483,38483748,3748374, 38483749,-1};
        int[] nums = radixSort(num);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static int[] radixSort(int[] nums){
        int maxLen = mostDigits(nums);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int k=0; k<maxLen; k++){
            for(int i=0; i<nums.length; i++){
                int digit = getDigit(nums[i], k);
                if(!map.containsKey(digit)){
                    map.put(digit, new ArrayList<Integer>());
                    map.get(digit).add(nums[i]);
                }else {
                    map.get(digit).add(nums[i]);
                }
            }

            int j = 0;
            for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
               // int key = entry.getKey();
               // System.out.println("key " + key);
                for(Integer value: entry.getValue()){
                    //System.out.println("value " + value);
                    if(j<nums.length) {
                        nums[j] = value;
                        j++;
                    }
                }
            }
            map.clear();
        }
        return nums;
    }

    private static int getDigit(int num, int position){
        return (int) (Math.round(Math.abs(num)/Math.pow(10,position)) %10);
    }

    private static int digitCount(int num){
        if(num == 0) return 1;
        return (int)Math.log10(Math.abs(num))+1;
    }

    private static int mostDigits(int[] num){
        int max=0;
        for(int i=0; i<num.length; i++){
            max = Math.max(max, digitCount(num[i]));
        }
        return max;
    }
}
