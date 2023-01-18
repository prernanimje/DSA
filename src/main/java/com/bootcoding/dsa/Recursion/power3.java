package com.bootcoding.dsa.Recursion;

public class power3 {
    public static void main(String[] args) {
        int n=2;
        int p=3;
        System.out.println(digits(n,p));
    }
    public static int digits(int n,int p){
        if(p==0){
            return 1;
        }
        return n*digits(n,p-1);
    }
}
