package patterns;

import java.util.HashMap;
import java.util.Map;

public class anagram {

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        //looping first String and frequency of each character using HashMap
        //looping second array and if char equal a key, subscribe value -1
        //if char is not exist return false else true

        if(s.length()!=t.length())return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){//O(n)
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++){//O(n)
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){//O(n)
            if(entry.getValue() < 0 || entry.getValue()>0 ){
                return false;
            }
        }

        return true;
    }
}
