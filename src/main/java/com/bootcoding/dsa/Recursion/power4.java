package com.bootcoding.dsa.Recursion;

public class power4 {
    public static int digit(int n, int p){
        if(p==0){
            return 1;
        }
        return n*digit(n,p-1);
    }

    public static void main(String[] args) {
        int n=2;
        int p=3;
        System.out.println(digit(n,p));
    }
}
