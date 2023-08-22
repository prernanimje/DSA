package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        List arr = Collections.singletonList(strStr("sadbutsad","sad"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}
