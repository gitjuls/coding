package patterns;

import java.util.HashMap;

public class frequencyCounterPattern {
    //given two arrays
    //verify if second array contains square of first array
    // arr1 = {1,4,2, 1}  arr2={1,16,1,4}  return true
    public static void main(String[] args) {
        int[] arr1 = {1,4,2, 1};
        int[] arr2 = {1,16,1,4};

        System.out.println(solution(arr1, arr2));
    }

    public static boolean solution(int[] arr1, int[] arr2){
        //count frequency of elements in each array using HashMap
        //compare (key of square) of first map and key of second map and their values
        //return true or false
        //O(n)
        //verify corner case if arr1.length!=arr2.length return false

        if(arr1.length!=arr2.length)return false;

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i=0; i<arr1.length; i++){//O(n)
            int square = arr1[i] * arr1[i];
            if(map1.containsKey(square)){
                map1.put(square, map1.get(square)+1);
            }else{
                map1.put(square,1);
            }
        }

        for(int i=0; i<arr2.length; i++){//O(n)
            if(map2.containsKey(arr2[i])){
                map2.put(arr2[i], map2.get(arr2[i])+1);
            }else{
                map2.put(arr2[i],1);
            }
        }

        return map1.equals(map2)? true: false;
    }

}
