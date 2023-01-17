package com.bootcoding.dsa.Recursion;

public class printArray {

    public static void main(String[] args) {
        int[] print={10,20,30,40,50};
        Array(print,0);

    }

    public static void Array(int [] print, int i){
        if(i==print.length){
            return;
        }

        System.out.println(print[i]);
        Array(print,++i);
    }
}
