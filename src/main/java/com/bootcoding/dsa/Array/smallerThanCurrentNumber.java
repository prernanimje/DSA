package com.bootcoding.dsa.Array;

public class smallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j]!=nums[i] && nums[i]>nums[j]){
                    count++;
                    continue;
                   // count=result[];
                }
                if(nums[i]<nums[j]){
                    count++;
                }
                System.out.println(nums[i]);
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
    }
}
