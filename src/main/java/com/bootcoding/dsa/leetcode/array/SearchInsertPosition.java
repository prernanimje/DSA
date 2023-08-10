package com.bootcoding.dsa.leetcode.array;

import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {
    public static void main(String[] args) {
    int[]nums = {1,3,5,6};
        List agg= Collections.singletonList(searchInsert(nums,5));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==target)return i;
            if(i==0 && target<nums[i])return i;
            if(i>0 && target>nums[i-1] && target<nums[i]) return i;
            i++;
        }
        return i;
    }
}
