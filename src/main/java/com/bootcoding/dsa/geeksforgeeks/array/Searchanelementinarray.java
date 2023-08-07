package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Collections;
import java.util.List;

public class Searchanelementinarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        List agg= Collections.singletonList(search(arr,4,3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    private static int search(int arr[], int N, int X)
    {
        int val=0;
        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;

    }
}
