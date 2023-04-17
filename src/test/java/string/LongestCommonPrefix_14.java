package string;

public class LongestCommonPrefix_14 {
    //https://leetcode.com/problems/longest-common-prefix/
    //Write a function to find the longest common prefix string amongst an array of strings.
    //If there is no common prefix, return an empty string "".
    //
    //Example 1:
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //
    //Example 2:
    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"}; //{"flower", "flow", "flight"};

        //find first shortest String from arr
        //the shortest String would have the longest common prefix
        int len = 0;
        for (int i = 0, e = 1; e <= strs.length - 1; i++, e++) { //O(n)
            len = Math.min(strs[i].length(), strs[e].length());
        }

        String prefix = "";
        for (String str : strs) { //O(n)
            if (str.length() == len) {
                prefix = str;
            }
            if (prefix.length() > 0) {
                break;
            }
        }

        //find the longest common prefix
        int counter = 0;
        int time = strs.length; //repeats 3 times
        do{
            for (String str : strs) {
                //if str from String array contains the prefix -> increase counter
                if (str.contains(prefix)) {
                    counter = counter + 1;
                }
            }
               //if condition false -> decrease prefix on one character and reset counter
            if(prefix.length()-1!=0 && counter!=time) {
                prefix = prefix.substring(0, prefix.length() - 1);
                counter = 0;
            }else{break;}
        }while (counter!=time); //O(n*m)

        if(counter==time){
            System.out.println(prefix);
        }else{ System.out.println("non");}

    }
}
