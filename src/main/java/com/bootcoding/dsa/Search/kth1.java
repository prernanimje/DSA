package com.bootcoding.dsa.Search;

import java.util.concurrent.Callable;

public class kth1 {
    public static int Calculate(int arr[],int k) {

         k = 2;
        int n= arr.length;
        return arr[n - 1] + k;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4};
       int index= Calculate(arr,0);
        System.out.println(index);
    }
}
