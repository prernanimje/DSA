package com.bootcoding.dsa.Array;

import java.util.Arrays;

public class maxSumofArray {
    //leetcode 628
    public static int sum(int []nums){
        int n=nums.length;
        Arrays.sort(nums);
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[2]);

    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        sum(nums);
        System.out.println(sum(nums));
    }
}
