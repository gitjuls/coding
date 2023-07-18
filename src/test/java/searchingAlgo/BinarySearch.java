package searchingAlgo;

public class BinarySearch {
    //array should to be sorted
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,10,34,50};
        int targetSearch = 34;
        System.out.println(binarySearch(arr, targetSearch));
    }

    public static int binarySearch(int[] arr, int num){
        int start =0;
        int end = arr.length-1;
        int middle = Math.round((start+end)/2);

        while(arr[middle] != num && start<=end){
            if(num < arr[middle]){
                end = middle-1;
            }else{
                start = middle +1;
                middle = Math.round((start+end)/2);
            }
        }
        return arr[middle] == num ? middle : -1;
    }
}
