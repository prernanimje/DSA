package com.bootcoding.dsa.leetcode.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortthePeople {
    public static void main(String[] args) {
       String[] names = {"Mary","John","Emma"};
       int []heights = {180,165,170};
        List agg= Collections.singletonList(sortPeople(names,heights));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0; i<names.length ;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[heights.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[j]=map.get(heights[i]);
            j++;
        }
        return ans;
    }
}
