package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int []nums={3,2,1};
        List agg= Collections.singletonList(thirdMax(nums));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        int f=0;
        for(int i=n-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                f=f+1;
            }
            else{
                count=count+1;
            }
            if(count==3){
                return nums[n-count-f];
            }
        }
        return nums[n-1];
    }
}
