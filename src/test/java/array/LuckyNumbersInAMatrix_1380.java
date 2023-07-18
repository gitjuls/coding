package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix_1380 {
    //Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    //
    //A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    //
    //
    //
    //Example 1:
    //
    //Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
    //Output: [15]
    //Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
    //Example 2:
    //
    //Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
    //Output: [12]
    //Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
    //Example 3:
    //
    //Input: matrix = [[7,8],[1,2]]
    //Output: [7]
    //Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> list =  luckyNumbers(matrix);
        list.stream().forEach(System.out::println);
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        //find min in each row
        int[] min = new int[matrix.length];
        for(int i =0; i<matrix.length; i++){
            int temp = Integer.MAX_VALUE;
            for(int e=0; e<matrix[0].length; e++){
                temp = Math.min(matrix[i][e],temp);
            }
           min[i] = temp;
        }

        //find max in each column
        int[] max = new int[matrix[0].length];
        for(int i=0; i<matrix[0].length; i++){
             int temp = Integer.MIN_VALUE;
            for(int e=0; e<matrix.length; e++){
                temp = Math.max(matrix[e][i],temp);
            }
           max[i] = temp;
        }

        //sort both arrays
        //check if min and max have the same number
        //if true -> return it

        for(int gap = min.length/2; gap>0; gap/=2 ){
            for(int i=gap; i<min.length; i++){
                int el= min[i];
                int j=i;
                while(j>=gap && min[j-gap]>el){
                    min[j]=min[j-gap];
                    j-=gap;
                }
                min[j]=el;
            }
        }

        for(int gap = max.length/2; gap>0; gap/=2 ){
            for(int i=gap; i<max.length; i++){
                int el= max[i];
                int j=i;
                while(j>=gap && max[j-gap]>el){
                    max[j]=max[j-gap];
                    j-=gap;
                }
                max[j]=el;
            }
        }

        if(min[min.length-1] == max[0]){
            list.add(max[0]);
            return list;
        }

        return list;
    }
}
