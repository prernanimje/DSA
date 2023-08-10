package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class NumberofEmployeesWhoMettheTarget {
    public static void main(String[] args) {
     int []hours={0,1,2,3,4};
        List agg= Collections.singletonList(numberOfEmployeesWhoMetTarget(hours, 3));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target ){
                count++;
            }
        }
        return count;
    }
}
