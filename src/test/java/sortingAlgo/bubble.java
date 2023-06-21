package sortingAlgo;

import java.util.Arrays;


public class bubble {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = bubbleSort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] bubbleSort(int[] arr){//O(n2) stable sort
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1]){
                   //swap(arr, i, i+1);
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        if(i==j){
            return;
        }

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
