package stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
       String s = "abc";
       System.out.println(solution(s));
    }

    public static String solution(String s){
        Stack<Character> stack = new Stack<>();

        for(Character ch: s.toCharArray()){
            stack.push(ch);
        }

        String reverseStr = "";
        do{
            reverseStr+=stack.pop();
        }while(!stack.isEmpty());

        return reverseStr;
    }
}
