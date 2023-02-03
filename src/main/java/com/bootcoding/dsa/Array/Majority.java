package com.bootcoding.dsa.Array;

public class Majority {
    public static void Number(int []nums){
        int count=1;
        int number=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                number=nums[i];
            }if(number==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        Number(nums);

    }
}
