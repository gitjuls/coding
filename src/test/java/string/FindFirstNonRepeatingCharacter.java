package string;

import java.util.*;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aaabccc";
        char[] arr = str.toCharArray();

        //find unique character
        //count each character
        //print first non repeating character

        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for (int i=0; i<arr.length; i++){//O(n)
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
                set.add(ch);
            }
        }

        char res = '_';
        Iterator itr = set.iterator();
        while (itr.hasNext()) { //O(n)
            char ch = (char) itr.next();
            if(map.get(ch)==1){
                res = ch;
            }
        }

        System.out.println(res);
    }
}
