package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        List agg= Collections.singletonList(print2largest(arr, 6));
        for(int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    private static int print2largest(int arr[], int n) {
        // code here
        int max=arr[0];
        int sl=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                sl=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>sl){
                sl=arr[i];
            }
        }
        return sl;

    }
}
