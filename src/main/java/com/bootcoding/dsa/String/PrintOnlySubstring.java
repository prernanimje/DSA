package com.bootcoding.dsa.String;

public class PrintOnlySubstring {
    public static void main(String[] args) {
        String str ="Programming";
        String sub=str.substring(0,8);
        System.out.println(sub);
        String sub2=str.substring(0,str.indexOf("i"));
        System.out.println(sub2);
    }
}
