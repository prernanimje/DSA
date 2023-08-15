package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class squareOfSortedArray {
    public static void square(int[]nums){
        Arrays.sort(nums);
       for (int i=0;i<nums.length;i++) {
           nums[i] = nums[i] * nums[i];
       }
           System.out.println(nums);


    }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        square(nums);
    }
}
