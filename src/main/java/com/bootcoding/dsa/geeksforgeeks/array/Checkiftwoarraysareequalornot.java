package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Checkiftwoarraysareequalornot {
    public static void main(String[] args) {
        int A[] = {1,2,5,4,0};
        int  B[] = {2,4,5,0,1};
        List agg= Collections.singletonList(check(A,B,5));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static boolean check(int[] A, int[] B, int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if(Arrays.equals(A,B)){
            return true;
        }
        return false;
    }
}
