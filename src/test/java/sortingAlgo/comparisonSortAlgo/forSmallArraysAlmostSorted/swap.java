package sortingAlgo.comparisonSortAlgo.forSmallArraysAlmostSorted;

public class swap {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
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
