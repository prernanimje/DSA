package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={1,65,9};
        List agg= Collections.singletonList(largest(arr, 3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }

    //With Arrays.sort()
    public static int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }

}
