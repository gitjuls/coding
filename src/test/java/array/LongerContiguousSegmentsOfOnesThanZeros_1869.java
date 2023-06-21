package array;

public class LongerContiguousSegmentsOfOnesThanZeros_1869 {
    //Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, or return false otherwise.
    //
    //For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.
    //Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a length 0. The same applies if there is no 1's.

    //Example 1:
    //Input: s = "1101"
    //Output: true
    //Explanation:
    //The longest contiguous segment of 1s has length 2: "1101"
    //The longest contiguous segment of 0s has length 1: "1101"
    //The segment of 1s is longer, so return true.

    //Example 2:
    //Input: s = "111000"
    //Output: false
    //Explanation:
    //The longest contiguous segment of 1s has length 3: "111000"
    //The longest contiguous segment of 0s has length 3: "111000"
    //The segment of 1s is not longer, so return false.

    //Example 3:
    //Input: s = "110100010"
    //Output: false
    //Explanation:
    //The longest contiguous segment of 1s has length 2: "110100010"
    //The longest contiguous segment of 0s has length 3: "110100010"
    //The segment of 1s is not longer, so return false.

    public static void main(String[] args) {
        String s = "1101";
        System.out.println(checkZeroOnes(s));
    }

    public static boolean checkZeroOnes2(String s) { // runtime error
        int zeroMax = 0;
        int onesMax = 0;
        int[] conter = new int[2];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') {
                conter[0]+=1;
                conter[1]=0;
                onesMax = Math.max(onesMax, conter[0]);
            }

            if(s.charAt(i)=='0') {
                conter[1]+=1;
                conter[0]=0;
                zeroMax = Math.max(zeroMax, conter[1]);
            }
        }
        return zeroMax>=onesMax? false : true;
    }

    public static boolean checkZeroOnes(String s) {
        int currOnesMax = 0;
        int currZeroMax =0;
        int zeroMax = 0;
        int onesMax = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') {
                currOnesMax++;
            }else{
                currOnesMax=0;
            }

            if(s.charAt(i)=='0') {
                currZeroMax++;
            }else{
                currZeroMax=0;
            }
            onesMax = Math.max(onesMax, currOnesMax);
            zeroMax = Math.max(zeroMax, currZeroMax);
        }

        return zeroMax>=onesMax? false : true;
    }
}
