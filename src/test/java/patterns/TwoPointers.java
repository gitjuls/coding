package patterns;

public class TwoPointers {

    public static void main(String[] args) {
        //if sum of two elements equal 0 return their indexes

        //array should to be sorted
        int[] arr = {-4,-3,-2,-1,0,1,2,3,10};
        solution(arr);
    }

    public static void solution(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == 0){
                System.out.println("left index " + left + " " + "right index " + right);
                right--;
                left++;
            }else if(sum>0){
                //move right
                right--;
            }else{
                //move left
                left++;
            }
        }
    }
}
