package com.bootcoding.dsa.Recursion;

public class printEven {

    public static void Print(int  n) {
        if (n == 0) {
            return;
        }
        Print(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        int n=10;
        Print(n);
    }

}
