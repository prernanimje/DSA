package com.bootcoding.dsa.leetcode.array;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
   int[] nums = {1,2,3,1};
   containsNearbyDuplicate(nums,3);
    }
    public static void containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k){
                System.out.println("true");
            }else{
                map.put(nums[i],i);

            }
        }
    }
}
