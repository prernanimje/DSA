package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class ToLowerCase {
    public static void main(String[] args) {
    String s = "Hello";
        List arr = Collections.singletonList(toLowerCase(s));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static String toLowerCase(String s) {
        int len=s.length();
        String res=null;
        for(int i=0;i<len;i++){
            res=s.toLowerCase();
        }
        return res;
    }
}
