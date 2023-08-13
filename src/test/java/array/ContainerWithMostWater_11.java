package array;

public class ContainerWithMostWater_11 {
    //You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the
    // ith line are (i, 0) and (i, height[i]).
    //Find two lines that together with the x-axis form a container, such that the container contains the most water.
    //Return the maximum amount of water a container can store.
    //Notice that you may not slant the container.

    //Input: height = [1,8,6,2,5,4,8,3,7]
    //Output: 49
    //Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
    //In this case, the max area of water (blue section) the container can contain is 49.

    //Example 2:
    //Input: height = [1,1]
    //Output: 1

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        //use formula to calculate volume = length * height
        //use to pointers solution
        //left pointer starts from index 0
        //right pointer starts from the end of array

        //assuming that container with max volume could be 2 types:
        //1st type - shallow, with the longest length
        //2nd type - deep, with short length

        //first max would be based on 1st type => calculate using first and last indexes
        //then verify 2nd type
        //if left pointer < than right pointer => increase the high of left pointer, it should to be equal or higher than right pointer
        //if left > right => increase right high
        //calculate max volume

        int length = height.length-1;
        int max =0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int maxV = 0;
            if(height[l] < height[r]){
                //                 1,[8,6,2,5,4,8],3,7
                //                 length-1 - length-6
                //                 8-1 - 8-6  => length 7 - 2 => 5
                maxV= height[l] * (length-l - (length-r));
                l++;
            }else if (height[l] > height[r]){
                maxV= height[r] * (length-l - (length-r));
                r--;
            }else if (height[l] == height[r]){
                maxV= height[l] * (length-l - (length-r));
                l++;
                r--;
            }
           max = Math.max(max,maxV);
        }
        return max;
    }
}
