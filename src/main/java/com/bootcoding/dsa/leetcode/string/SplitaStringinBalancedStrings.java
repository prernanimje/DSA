package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class SplitaStringinBalancedStrings {
    public static void main(String[] args) {
     String [] s={"RLRRLLRLRL"};
        List arr = Collections.singletonList(balancedStringSplit("RLRRLLRLRL"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int balancedStringSplit(String s) {
        int l=0, r=0, count =0;
        for(Character i : s.toCharArray()){
            if(i=='R')
                r++;
            else
                l++;
            if(l==r){
                count++;
                l=r=0;
            }
        }
        return count;
    }
}
