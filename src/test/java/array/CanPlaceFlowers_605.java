package array;

import java.util.Arrays;

public class CanPlaceFlowers_605 {
    //You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    //Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
    // return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

    //Example 1:
    //Input: flowerbed = [1,0,0,0,1], n = 1
    //Output: true

    //Example 2:
    //Input: flowerbed = [1,0,0,0,1], n = 2
    //Output: false

    public static void main(String[] args) {
        int[] flowerbed = {0,0,0,0,0};
        int n = 3;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length<3 && n==1){
            for(int i=0; i<flowerbed.length; i++){
                if(flowerbed[i]==1)return false;
            }
            return true;
        }

        int conter =0;
        for(int i=0; i<flowerbed.length; i++){
            if(n!=0){
                if(flowerbed[i]==0){
                    if(conter==1 && i-1==0 || conter==2){
                        flowerbed[i-1] = 1;
                        n--;
                        conter=0;
                       // return canPlaceFlowers(Arrays.copyOfRange(flowerbed,i-1,flowerbed.length),n);
                    }
                    else if(conter==1 && i==flowerbed.length-1){
                        flowerbed[i] = 1;
                        n--;
                        conter=0;
                      //  return canPlaceFlowers(Arrays.copyOfRange(flowerbed,i,flowerbed.length),n);
                    }
                    /*else if(conter==2){
                        flowerbed[i-1]=1;
                        n--;
                        return canPlaceFlowers(Arrays.copyOfRange(flowerbed,i-1,flowerbed.length),n);
                    }*/
                    conter++;
                }else{
                    conter=0;
                }
            }
        }
        return n == 0 ? true : false;
    }
}
