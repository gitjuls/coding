package sortingAlgo.comparisonSortAlgo.forBigArrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr3 = {10,24,76,73,-1,72,1,9};
        int[] res1 = divideMergeSort(arr3);
        int[] res2 = recursionMergeSort(arr3);
        Arrays.stream(res2).forEach(System.out::println);
    }

    public static int[] recursionMergeSort(int[] nums){
            int length = nums.length;
            if (length <= 1) return nums;

                int mid = Math.round(nums.length/2);
                int[] arr1=recursionMergeSort(Arrays.copyOfRange(nums,0,mid));
                int[] arr2=recursionMergeSort(Arrays.copyOfRange(nums,mid,nums.length));

                int[] result = new int[arr1.length + arr2.length];
                int i=0;
                int j=0;
                int e=0;
                while(i < arr1.length && j < arr2.length){
                    if(arr2[j] > arr1[i]){
                        result[e]=arr1[i];
                        e++;
                        i++;
                    }else if(arr2[j] < arr1[i]){
                        result[e] = arr2[j];
                        e++;
                        j++;
                    }else if(arr2[j] == arr1[i]){
                        result[e]=arr1[i];
                        e++;i++;
                        result[e]=arr2[j];
                        e++;j++;
                    }
                }

                while(i<arr1.length){
                    result[e] = arr1[i];
                    e++;
                    i++;
                }
                while(j<arr2.length){
                    result[e] = arr2[j];
                    e++;
                    j++;
                }
                return result;
        }
//--------------------------------------------------------------
    public static int[] divideMergeSort(int[] arr){
        if(arr.length <= 1) return arr;
        int mid = Math.round(arr.length/2);
        int[] arr1=divideArray(Arrays.copyOfRange(arr,0,mid));
        int[] arr2=divideArray(Arrays.copyOfRange(arr,mid,arr.length));

        int[] result = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int e=0;
        while(i < arr1.length && j < arr2.length){
            if(arr2[j] > arr1[i]){
                result[e]=arr1[i];
                e++;
                i++;
            }else if(arr2[j] < arr1[i]){
                result[e] = arr2[j];
                e++;
                j++;
            }else if(arr2[j] == arr1[i]){
                result[e]=arr1[i];
                e++;i++;
                result[e]=arr2[j];
                e++;j++;
            }
        }

        while(i<arr1.length){
            result[e] = arr1[i];
            e++;
            i++;
        }
        while(j<arr2.length){
            result[e] = arr2[j];
            e++;
            j++;
        }
        return result;
    }

    private static int[] divideArray(int[] arr){
        if(arr.length <= 1) return arr;
        int mid = Math.round(arr.length/2);
        int[] left=divideArray(Arrays.copyOfRange(arr,0,mid));
        int[] right=divideArray(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i=0; // arr1 index
        int j=0; // arr2 index
        int e=0;
        while(i < arr1.length && j < arr2.length){
            if(arr2[j] > arr1[i]){
                result[e]=arr1[i];
                e++;
                i++; // move index
            }else if(arr2[j] < arr1[i]){
                result[e] = arr2[j];
                e++;
                j++; // move index
            }else if(arr2[j] == arr1[i]){
                result[e]=arr1[i];
                e++;i++;
                result[e]=arr2[j];
                e++;j++;
            }
        }

        //add leftovers
        while(i<arr1.length){
            result[e] = arr1[i];
            e++;
            i++;
        }
        while(j<arr2.length){
            result[e] = arr2[j];
            e++;
            j++;
        }

        return result;
    }
}
