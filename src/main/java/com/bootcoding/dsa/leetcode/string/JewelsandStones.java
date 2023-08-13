package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class JewelsandStones {
    public static void main(String[] args) {
        List arr = Collections.singletonList(numJewelsInStones("aA", "aAAbbbb"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);
            if(jewels.contains(String.valueOf(c))) count++;
        }
        return count;
    }
}
