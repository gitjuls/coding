package patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Recursion {
    public static void main(String[] args) {
        //String str = "abcdabcd";
        //System.out.println(solution(str));

        int[] arr = {1,3,4,6};
        int[] res = solution2(arr);
        Arrays.stream(res).forEach(System.out::print);
    }

    public static int[] solution2(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        if(arr[0]%2==0){
            return arr;
        }
        int[] slice = Arrays.copyOfRange(arr,1,arr.length);//IntStream.range(1, arr.length).map(i->arr[i]).toArray();
        return solution2(slice);
    }

    public static int solution(String str){
        int countLetterA = 0;

        int i=0;
        if(str.length() == i){
            return countLetterA;
        }

        if(str.charAt(i) == 'a'){
            countLetterA+=1;
        }

        countLetterA +=(solution(str.substring(1)));
        return countLetterA;
    }
}
