package com.bootcoding.dsa.String;

public class CountTech {
    public static void main(String[] args) {
        String skills="c,c++,java,python";
        String[]tech=skills.split(",");
        System.out.println("The candidate knows"+tech.length+"Languages");
    }
}
