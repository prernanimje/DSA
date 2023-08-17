package com.bootcoding.dsa.potd;

import java.util.Collections;
import java.util.List;

public class FlipBits {
    public static void main(String[] args) {
        int arr[]={1, 0, 0, 1, 0};
        List agg= Collections.singletonList(maxOnes(arr, 3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int c1 = 0;

        for(int i = 0 ; i < n; i++)
        {
            if(a[i]==1)
            {
                a[i] = -1;
                c1++;
            }
            else
                a[i] = 1;
        }

        int max = a[0];
        int sum = a[0];

        for(int i = 1 ; i < n;i++)
        {
            sum = Math.max(a[i],sum+a[i]);
            max = Math.max(max,sum);
        }

        if(max<0) return n;

        return max+c1;
    }
}
