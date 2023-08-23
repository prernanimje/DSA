package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class leftandRightSumDifferences {
    public static void main(String[] args) {
        int [] arr={10,4,8,3};
        List agg= Collections.singletonList(leftRightDifference(arr));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []answer=new int [n];
        int []leftSum=new int[n];
        int []rightSum=new int[n];
        for(int i=1;i<nums.length;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}
