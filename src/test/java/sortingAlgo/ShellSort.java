package sortingAlgo;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] res = shellSort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] shellSort(int[] arr){//O(n2) or less; unstable; shell sort optimize insertion sort
        for(int gap = arr.length/2; gap>0; gap/=2 ){
            for(int i=gap; i<arr.length; i++){
                int el= arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>el){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=el;
            }
        }
        return arr;
    }


}
