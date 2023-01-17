package com.bootcoding.dsa.Recursion;

public class NaturalNumber {

    public static void print(int a){
        if(a==0){
            return;
        }
        print(a-1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a =50;
        print(a);

    }
}
