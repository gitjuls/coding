package array;

public class PalindromeNumber_9 {
    //Given an integer x, return true if x is a
    //palindrome
    //, and false otherwise.

    //Example 1:
    //
    //Input: x = 121
    //Output: true
    //Explanation: 121 reads as 121 from left to right and from right to left.
    //Example 2:
    //
    //Input: x = -121
    //Output: false
    //Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    //Example 3:
    //
    //Input: x = 10
    //Output: false
    //Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome2(x));
    }
    public static boolean isPalindrome2(int x) {
        int revertedX =0;
        int oldX =x;

        if(x<0)return false;

        while(x>0){
            int reminder = x % 10;
            revertedX = revertedX * 10 + reminder;
            x/=10;
        }
        return oldX==revertedX;
    }


    public static boolean isPalindrome(int x) {
        //check if x negative => return false
        //convert x to String
        //check if length of the String equal 1 => return true
        //check if left and right are equal, until left index < right index

        if(x<0)return false;

        String str = String.valueOf(x);

        if(str.length() == 1)return true;

        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;
    }
}
