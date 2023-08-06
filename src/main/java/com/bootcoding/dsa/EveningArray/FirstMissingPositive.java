package com.bootcoding.dsa.EveningArray;

import java.util.Arrays;

public class FirstMissingPositive {
   public static  void  firstMissingPositive(int []nums){
       int miss=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           if(nums[i]>0){
               if(nums[i]==miss){

               }else {
                   miss++;
               }
           }
       }
       System.out.println(miss);
   }

    public static void main(String[] args) {
       int [] nums = {3,4,-1,1};
       firstMissingPositive(nums);
    }
}
