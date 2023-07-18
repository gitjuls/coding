package sortingAlgo.comparisonSortAlgo.forBigArrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,8,2,1,5,7,6,3,0,-1,0};
        int[] res = quickSort(arr, 0, arr.length-1);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] quickSort(int[] arr, int left, int right){
        if(left<right) {
            int pivotIndex = pivot(arr, left);
            //left
            quickSort(arr, left, pivotIndex - 1);
            //right
            quickSort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    public static int pivot(int[] arr, int start){
        int pivot = arr[start];
        int swapIndex = start;

        for(int i=start+1; i< arr.length; i++){
            if(pivot > arr[i]){
                swapIndex++;
                swap(arr, swapIndex,i);
            }
        }
        swap(arr, start, swapIndex);
        return swapIndex;
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
