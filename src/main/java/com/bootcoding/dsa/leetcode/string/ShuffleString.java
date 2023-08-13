package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class ShuffleString {
    public static void main(String[] args) {
        int[]indices = {4,5,6,7,0,2,1,3};
        List arr = Collections.singletonList(restoreString("codeleet",indices));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static String restoreString(String s, int[] indices) {
        char[] answer = new char[s.length()];
        for(int i=0;i<s.length();i++){
            int targetIndex=indices[i];
            answer[targetIndex]=s.charAt(i);
        }
        return String.valueOf(answer);
    }
}
