package com.bootcoding.dsa.Recursion;

public class print {
    public static void print1(int n){
        if(n==0){
            return;
        }
        print1(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n=10;
       print1(n);
    }
}
