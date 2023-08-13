package array;

import java.util.HashSet;

public class CheckIfEveryRowAndColumnContainsAllNumbers_2133 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,2},{1,2,3},{1,2,3}};//{{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix){
        //check each row
        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> set= new HashSet<>();
            for(int e=0; e<matrix.length; e++){
                set.add(matrix[i][e]);
            }
            if(set.size()!=matrix.length){
                return false;
            }
        }

        //check each column
        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> set= new HashSet<>();
            for(int e=0; e<matrix.length; e++) {
                set.add(matrix[e][i]);
            }
            if(set.size()!=matrix.length){
                return false;
            }
        }

        return true;
    }
}
