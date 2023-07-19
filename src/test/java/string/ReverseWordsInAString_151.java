package string;

public class ReverseWordsInAString_151 {
    //Given an input string s, reverse the order of the words.
    //
    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //
    //Return a string of the words in reverse order concatenated by a single space.
    //
    //Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "the sky is blue"
    //Output: "blue is sky the"
    //Example 2:
    //
    //Input: s = "  hello world  "
    //Output: "world hello"
    //Explanation: Your reversed string should not contain leading or trailing spaces.
    //Example 3:
    //
    //Input: s = "a good   example"
    //Output: "example good a"
    //Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

    public static void main(String[] args) {
        String str = " the  sky    is  blue ";
        System.out.println(reverseWords(str));
    }

    //8ms Beats 66.89% runtime
    public static String reverseWords(String s){
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    //13ms
    public static String reverseWords2(String s){
        String[] str = s.trim().split("\\s+");
        s="";
        for(int i=str.length-1; i>=0; i--){
            s+=str[i];
            if(i!=0){
                s+=" ";
            }
        }
        return s;
    }

    //13ms
    public static String reverseWords1(String s) {
        String str = "";
        String res ="";
        s=s.trim();
        int right=s.length()-1;
        for(int left=s.length()-1; left>=0; left--){
            if(s.charAt(left)==' '&& s.charAt(left-1)!= ' '){
                str = s.substring(left,right+1);
                res+=str.trim() + " ";
                right=left;
                str="";
            }
            if(left==0){
            str = s.substring(0,right+1);
            res+=str.trim();
            }
        }
        return res;
    }
}
