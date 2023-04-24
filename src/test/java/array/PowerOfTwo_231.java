package array;

public class PowerOfTwo_231 {
    //Given an integer n, return true if it is a power of two. Otherwise, return false.
    //An integer n is a power of two, if there exists an integer x such that n == 2x.
    //
    //Example 1:
    //Input: n = 1
    //Output: true
    //Explanation: 20 = 1
    //
    //Example 2:
    //Input: n = 16
    //Output: true
    //Explanation: 24 = 16
    //
    //Example 3:
    //Input: n = 3
    //Output: false

    public static void main(String[] args) {
        int n = 1;
        boolean isTrue = isPowerOfTwo(n);
        System.out.println(isTrue);
    }

    public static boolean isPowerOfTwo(int n) { //n=6                           n=3
        if(n==1){                               //6!=1 false                    3!=1 false
            return true;
        }else if(n<=0 || n%2 != 0){             //6<=0 false || 6%2!=0 false    3<=0 false || 3%2 true
            return false;                                                       //return false
        }
        return isPowerOfTwo(n/2);            //6/2=3;
    }

}
