package com.bootcoding.dsa.Array;

public class CountPair {
    public static int countPairs(int[] nums) {
        int count=0;
         int k=2;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j] && (i*j)%k==0){
                        count++;
                }
            }
        }
        System.out.println(count);

        return count;

    }

    public static void main(String[] args) {
        int[] nums={3,1,2,2,2,1,3};
        countPairs(nums);
    }


}
