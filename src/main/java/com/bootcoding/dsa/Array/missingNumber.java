package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class missingNumber {
    //leetcode 268
    public static void missing(int [] nums){
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

    public static void main(String[] args) {
        int []nums={3,0,1};
        missing(nums);

    }
}
