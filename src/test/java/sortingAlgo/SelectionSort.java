package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = selectionSort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] selectionSort(int[] arr){//O(n2) unstable sort
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int larget =0;
            for(int i=1; i<=lastUnsortedIndex; i++){
                if(arr[i] > arr[larget]){
                    larget =i;
                }
            }
            int temp = arr[larget];
            arr[larget]=arr[lastUnsortedIndex];
            arr[lastUnsortedIndex]=temp;
        }

        return arr;
    }
}
