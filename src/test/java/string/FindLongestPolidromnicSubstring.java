package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestPolidromnicSubstring {
    //Given a string s, return the longest
    //palindromic substring in s.
    //Example 1:
    //
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: "bb"

    /*public static void main(String[] args) {
            String str = "cbbd";//"bababad";//"babad";
            int[] index = new int[2];

            for(int i=str.length()-1, e=0; i>=0; i--){
                //save first temp char
                char temp = str.charAt(e);

                if(temp == str.charAt(i)){
                    index[0] = e;
                    index[1] = i;
                }else if (temp != str.charAt(i) && i>=0){
                    e++;
                }
            }

            for(int i=index[0]; i<=index[1]; i++){
                System.out.println(str.charAt(i));
            }
    }*/

/*    public static void main(String[] args) {
        String str = "cbhbd";//"bababad";//"babad";
        int length = str.length()-2;
        int[] index = new int[2];

        if(length>2){
            for(int i=1; i<=length;i++){
                int left = i-1;
                int rigth = i+1;
                if(str.charAt(left)==str.charAt(rigth)){
                    index[0] = left;
                    index[1] = rigth;
                }
*//*                if(left > 0 || rigth < length){
                    int subLeft = left-1;
                    int subRigth = rigth+1;
                }else{
                    i++;
                }*//*
            }
        }
        Arrays.stream(index).forEach(System.out::println);
    }*/


    public static void main(String[] args) {
        String str = "babad";//"cbbd";//
        String num = str.length()%2==0? "odd":"even";
        int left = 0;
        int right =0;
        int[] res = new int[2];

        if(num == "even"){
            int pointer = str.length()/2;
            left = pointer-1;
            right = pointer+1;
        }
        if(num == "odd"){
            left = str.length()/2-1;
            right = str.length()/2;
        }
        do{
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            if(leftChar==rightChar){
                res[0]=left;
                res[1]=right;
                left--;
                right++;
            }else{
                //split the string on a half and repeat steps for each substring
                break;
            }
        }while(left>=0);

        String output = "";
        for(int i=res[0]; i<=res[1]; i++){
            output+=str.charAt(i);
        }
        System.out.println(output);
    }
}
