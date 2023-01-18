package com.bootcoding.dsa.Recursion;

public class countDigits {
    public static int digit(int num){
        if(num<10){
            return 1;
        }
        return 1 + digit(num/10);
    }

    public static void main(String[] args) {
        int num=833;

       int r= digit(num);
        System.out.println(r);
    }



}
