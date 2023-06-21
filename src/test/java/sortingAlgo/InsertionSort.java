package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = insertionSort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    private static int[] insertionSort(int[] arr) {//O(n2) stable

        for(int i=1; i<arr.length; i++){
            //save element
            int el = arr[i];
            int e=i;
            while(e > 0 && arr[e-1] > el){
                //shift el to left
                arr[e] = arr[e-1];
                e--;
            }
            //assign new el
            arr[e]=el;
        }
        return arr;
    }

}
