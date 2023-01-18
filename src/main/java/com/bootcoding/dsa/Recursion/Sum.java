package com.bootcoding.dsa.Recursion;

public class Sum {
    public static int Print(int s){
        if(s==1){
            return s;
        }
       return s%10 + Print(s/10);

    }


    public static void main(String[] args) {
        int s= 12;
       int res= Print(s);
        System.out.println(res);
    }
}
