package sortingAlgo.comparisonSortAlgo.forSmallArraysAlmostSorted;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = selectionSort2(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] selectionSort(int[] arr){//O(n2) unstable sort
        for(int i = arr.length-1; i>0; i--){
            int larget =0;
            for(int e=1; e<=i; e++){
                if(arr[e] > arr[larget]){
                    larget =e;
                }
            }
            int temp = arr[larget];
            arr[larget]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static int[] selectionSort2(int[] arr){//O(n2) unstable sort
        for(int i = 0; i<arr.length; i++){
            int lowest = i;
            for(int e=i+1; e<arr.length; e++){
                if(arr[e] < arr[lowest]){
                    lowest =e;
                }
            }
            int temp = arr[lowest];
            arr[lowest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
