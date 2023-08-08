package com.bootcoding.dsa.geeksforgeeks.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missingnumberinarray {
    public static void main(String[] args) {
      int[]nums={0,4,1,2};
      missingNumber(nums,4);
    }
    private static void missingNumber(int nums[], int n) {
        // Your Code Here
        int miss=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(miss==nums[i]){
                continue;
            }else{
                miss++;
            }
        }
        System.out.println(miss);

    }
}
