package com.bootcoding.dsa.potd;

import java.util.Collections;
import java.util.List;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        List arr = Collections.singletonList(nthFibonacci(2));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int nthFibonacci(int n){
        // code here
        int n1=0;
        int n2=1;
        for(int i=2;i<=n;i++){
            int temp=n2;
            n2=(n1+n2)%1000000007;
            n1=temp;
        }
        if(n==0){
            return n1;
        }
        return n2;
    }
}
