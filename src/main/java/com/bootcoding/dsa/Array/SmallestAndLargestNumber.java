package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class SmallestAndLargestNumber {
    public static void LargeNumber(int []arr){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }else if (arr[i]<small){
                small=arr[i];
            }
        }

        System.out.println(small);
        System.out.println(large);
    }

    public static void main(String[] args) {
        int []arr={5,12,4,8,6,100,44,78,5,122,2};
        LargeNumber(arr);
    }
}
