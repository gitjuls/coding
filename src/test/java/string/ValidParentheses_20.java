package string;

public class ValidParentheses_20 {

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //An input string is valid if:
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    //
    //Example 1:
    //Input: s = "()"
    //Output: true

    //Example 2:
    //Input: s = "()[]{}"
    //Output: true

    //Example 3:
    //Input: s = "(]"
    //Output: false

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
        String s4 = "()[]{}";
        System.out.println(isValid(s4));
        String s7 = "({{}})";
        System.out.println(isValid(s7));
        String s8 = "(([]){})";
        System.out.println(isValid(s8));
        String s9 = "[({(())}[()])]";
        System.out.println(isValid(s9));
        String s2 = "((";
        System.out.println(isValid(s2));
        String s3 = "}";
        System.out.println(isValid(s3));
        String s1 = "([)]";
        System.out.println(isValid(s1));
        String s6 = "(){}}{";
        System.out.println(isValid(s6));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);
        boolean isDelete = false;

        for (int i = 0, j = 1; j < sb.length(); i++, j++) {
            if ( (int)sb.charAt(i) + 1 == (int)sb.charAt(j) || (int)sb.charAt(i) + 2 == (int)sb.charAt(j)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(j - 1);
                isDelete = true;
            }
        }

        if (sb.length() == 0) {
            return true;
        } else if (isDelete == false) {
            return false;
        }

        return isValid(sb.toString());

    }
}
