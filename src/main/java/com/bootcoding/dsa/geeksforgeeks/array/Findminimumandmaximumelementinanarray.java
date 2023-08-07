package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Collections;
import java.util.List;

public class Findminimumandmaximumelementinanarray {
    public static void main(String[] args) {
        int[]arr={3, 2, 1, 56, 10000, 167};
        getMinMax(arr,6);

    }
     private static void getMinMax(int[] a, long n)
    {
        //Write your code here
        long max=a[0];
        long min=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }


}
