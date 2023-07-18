package sortingAlgo.comparisonSortAlgo.forSmallArraysAlmostSorted;

import java.util.Arrays;


public class bubble {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = bubbleSortImproved(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] bubbleSortImproved(int[] arr){//O(n2) stable sort
        boolean noSwaps;
        for(int e = arr.length; e>0; e--){
            noSwaps = true;
            for(int i=0; i<e-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    noSwaps = false;
                }
            }
            if(noSwaps)break;
        }
        return arr;
    }
}
