package com.bootcoding.dsa.potd;

import java.util.Collections;
import java.util.List;

public class Numberofoccurrence {
    public static void main(String[] args) {
      int []agg={1, 1, 2, 2, 2, 2, 3};
        List arr = Collections.singletonList(count(agg,7,2));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int count(int[] arr, int n, int x) {
        // code here
        int rep=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                rep++;

            }
        }
        return rep;
    }
}
