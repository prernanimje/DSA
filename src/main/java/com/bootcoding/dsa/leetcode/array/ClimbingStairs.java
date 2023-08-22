package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class ClimbingStairs {
    public static void main(String[] args) {
        List agg= Collections.singletonList(climbStairs(2));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int climbStairs(int n) {
        if(n==1) return 1;

        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
