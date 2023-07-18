package string;

import org.checkerframework.checker.units.qual.C;

import java.util.*;

public class WordPattern_290 {
    //Given a pattern and a string s, find if s follows the same pattern.
    //Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

    //Example 1:
    //Input: pattern = "abba", s = "dog cat cat dog"
    //Output: true

    //Example 2:
    //Input: pattern = "abba", s = "dog cat cat fish"
    //Output: false

    //Example 3:
    //Input: pattern = "aaaa", s = "dog cat cat dog"
    //Output: false

    public static void main(String[] args) {
        String pattern = "abba";// "abba";
        String s ="dog cat fish dog"; //"dog cat cat dog";
        boolean isTrue = wordPattern(pattern,s);
        System.out.println(isTrue);
    }

    public static boolean wordPattern(String pattern, String s) {
        //create array of strings
        String[] strArr = s.split("\\s");

        //corner case, if String array and pattern have different sizes => return false
        if(strArr.length!=pattern.length()){
            return false;
        }

        //looking for unique characters in pattern and its indexes
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), map.get(pattern.charAt(i))+i+",");
            }else{
                map.put(pattern.charAt(i), i+",");
            }
        }

        //looking for amount of unique strings
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<strArr.length; i++){
            set.add(strArr[i]);
        }

        //verify if amount of unique strings equal amount of unique characters in pattern
        // cat cat cat cat != abba
        // 1 != 2
        //but:  cat dog cat cat , abba =>return true
        if(set.size()!=map.size()){
            return false;
        }

        //verify for each unique character => if string values equal character indexes
        //a[0] a[1] a[2] == dog[0] dog[1] dog[2]
        //b[3] == cat[3]
        //and:  cat dog cat cat , abba =>return false
        for(Map.Entry<Character,String> entry: map.entrySet()){
            String[] indexesArr = entry.getValue().split(",");
            for(int i=1; i<indexesArr.length; i++){
                if(!strArr[Integer.parseInt(indexesArr[i])].equalsIgnoreCase(strArr[Integer.parseInt(indexesArr[i-1])])){
                    return false;
                }
            }
        }

        return true;
    }
}
