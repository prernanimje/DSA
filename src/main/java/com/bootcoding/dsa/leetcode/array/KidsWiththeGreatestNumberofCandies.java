package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
     int[]candies = {2,3,5,1,3};
        List agg= Collections.singletonList(kidsWithCandies(candies,3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++)
            if(candies[i]>max)
                max=candies[i];
        for(int i:candies){
            if(extraCandies+i >=max)
                list.add(true);
            else
                list.add(false);

        }

        return list;

    }
}
