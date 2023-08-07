package com.bootcoding.dsa.geeksforgeeks.array;

import com.bootcoding.dsa.queue.LinearQueue;

import java.util.Collections;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
      int []arr={3,1,3,3,2};
        List agg= Collections.singletonList(majorityElement(arr, 5));
        for(int i=0;i<agg.size();i++){
            System.out.println(agg.get(i));
        }
       }
    private static int majorityElement(int a[], int size)
    {
        // your code here
        int count=0;
        int number=a[0];
        int n=a.length;

        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                number=a[i];
            }
            else if(number==a[i]) count++;
            else count--;
        }

        int count1=0;
        for(int i=0;i<n;i++){
            if(a[i]==number) count1++;
            if(count1>n/2) return number;
        }
        return -1;
    }
}
