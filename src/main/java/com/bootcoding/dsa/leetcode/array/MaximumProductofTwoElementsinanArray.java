package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
      int[] nums={3,4,5,2};
        List agg= Collections.singletonList(maxProduct(nums));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }


    public static int maxProduct(int[] nums) {
        int max1 = nums[0];
        int max2 = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = (max1 > max2) ? max1 : max2;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max1 = (max2 > max1) ? max2 : max1;
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}