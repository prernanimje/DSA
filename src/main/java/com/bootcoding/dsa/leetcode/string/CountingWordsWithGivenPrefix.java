package com.bootcoding.dsa.leetcode.string;

import java.util.Collections;
import java.util.List;

public class CountingWordsWithGivenPrefix {


    //leepcode 2185
    public static int  prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[]words={"pay","attention","practice","attend"};
        List arr = Collections.singletonList(prefixCount(words,"at"));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
