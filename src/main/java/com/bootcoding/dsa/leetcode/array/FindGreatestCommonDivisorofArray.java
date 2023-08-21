package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int []nums={2,5,6,9,10};
        List agg= Collections.singletonList(findGCD(nums));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int result=nums[0];
        while(result>0){
            if(nums[0]%result==0 && n%result==0){
                break;
            }
            result--;
        }
        return result;
    }
}
