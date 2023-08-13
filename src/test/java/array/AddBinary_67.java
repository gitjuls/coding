package array;

public class AddBinary_67 {
    //Given two binary strings a and b, return their sum as a binary string.
    //
    //Example 1:
    //Input: a = "11", b = "1"
    //Output: "100"

    //Example 2:
    //Input: a = "1010", b = "1011"
    //Output: "10101"

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        System.out.println((int) a.charAt(0));
        System.out.println(Integer.toBinaryString(a.charAt(0) - '0') + " " + Integer.toBinaryString(a.charAt(1)-'0'));
        System.out.println(Integer.toBinaryString(a.charAt(0)-'0') + Integer.toBinaryString( a.charAt(1)-'0'));

        return "";
    }
}
