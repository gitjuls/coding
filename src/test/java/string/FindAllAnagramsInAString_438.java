package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString_438 {
    //Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
    //
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "cbaebabacd", p = "abc"
    //Output: [0,6]
    //Explanation:
    //The substring with start index = 0 is "cba", which is an anagram of "abc".
    //The substring with start index = 6 is "bac", which is an anagram of "abc".
    //Example 2:
    //
    //Input: s = "abab", p = "ab"
    //Output: [0,1,2]
    //Explanation:
    //The substring with start index = 0 is "ab", which is an anagram of "ab".
    //The substring with start index = 1 is "ba", which is an anagram of "ab".
    //The substring with start index = 2 is "ab", which is an anagram of "ab".

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
       List<Integer> list = findAnagrams(s,p);
       list.stream().forEach(System.out::println);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        //corner case if p.length == 1
        if(p.length()==1){//O(n)
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == p.charAt(0)){
                    list.add(i);
                }
            }
            return list;
        }

        //find frequency of characters in p
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<p.length();i++){//O(n)
            if(map.containsKey(p.charAt(i))){
                map.put(p.charAt(i), map.get(p.charAt(i))+1);
            }else{
                map.put(p.charAt(i), 1);
            }
        }

        //create a first string
        String str = "";
        int counter = p.length();
        for(int i=0; i<s.length(); i++){//O(n)
            if(counter>0){
                str+=s.charAt(i);
                counter--;
            }
            if(counter<=0)break;
        }

        //find frequency of characters in the first string
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<str.length();i++){//O(n)
            if(map2.containsKey(s.charAt(i))){
                map2.put(s.charAt(i), map2.get(s.charAt(i))+1);
            }else{
                map2.put(s.charAt(i), 1);
            }
        }

        //use slide window search
        for(int i=1; i<s.length(); i++){//O(n)
            //add index to the list if true
            if(map2.equals(map)){
                list.add(i-1);
            }

            //subtract value -1 from first char
            //delete char completely if after subtraction the value equal 0
            if(map2.containsKey(s.charAt(i-1))){
                char ch = s.charAt(i-1);
                map2.put(ch, map2.get(ch)-1);
                if(map2.get(ch) == 0) {
                    map2.remove(ch);
                }
            }
            //add the next 'window' char
            if(i+p.length()-1<s.length()) {
                char ch = s.charAt(i + p.length()-1);
                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.get(ch) + 1);
                } else {
                    map2.put(ch, 1);
                }
            }
        }

        return list;
    }
}
