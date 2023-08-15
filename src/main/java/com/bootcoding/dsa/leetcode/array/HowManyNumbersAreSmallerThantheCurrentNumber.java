package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
     int[]nums = {8,1,2,2,3};
        List agg= Collections.singletonList(smallerNumbersThanCurrent(nums));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] < nums[i])
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
