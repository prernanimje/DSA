package com.bootcoding.dsa.Recursion;

public class ReverseString {

    public static void Array(int [] n, int i){
        if(i==n.length){
            return ;
        }
        System.out.println(n[i]);
        Array(n,--i);
    }

    public static void main(String[] args) {
        int[] n={10,11,12,12,50,13};
        Array(n,5);
    }
}
