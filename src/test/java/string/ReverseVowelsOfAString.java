package string;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
    //Given a string s, reverse only all the vowels in the string and return it.
    //The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    //
    //Example 1:
    //Input: s = "hello"
    //Output: "holle"
    //
    //Example 2:
    //Input: s = "leetcode"
    //Output: "leotcede"

    public static void main(String[] args) {
        String str = "hello";//"leetcode";;

        //find indexes
        List<Integer> index = new ArrayList<>();
        for(int i=0; i<=str.length()-1;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                index.add(i);
            }
        }

        //swap indexes
        for(int i=0, j=1; j<=index.size()-1; i++, j++){
            int temp = index.get(i);
            index.set(i, index.get(j));
            index.set(j, temp);
        }

        //swap vowels
        StringBuilder sb = new StringBuilder(str);
        for(int i=0, j=1; j<=index.size()-1; i++, j++){
            char temp = str.charAt(index.get(i));
            char temp2 = str.charAt(index.get(j));
            sb.delete(index.get(i),index.get(i)+1).replace(index.get(i),index.get(i), String.valueOf(temp2));
            sb.delete(index.get(j),index.get(j)+1).replace(index.get(j),index.get(j), String.valueOf(temp));
        }
        System.out.println(sb.toString());
    }
}
