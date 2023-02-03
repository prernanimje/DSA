package com.bootcoding.dsa.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class indices {
    public static void targetIndices(int[] nums, int target) {
        List <Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result.add(i);
            }
        }
        System.out.println(result);

    }



    public static void main(String[] args) {
        int []nums={1,2,5,2,3};
        targetIndices(nums,2);

    }
}
