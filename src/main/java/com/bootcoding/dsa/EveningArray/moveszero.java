package com.bootcoding.dsa.EveningArray;

public class moveszero {
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums [j]=0;
            j++;
        }

    }
    public static void print(int[]nums){
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[]nums={0,1,0,3,12};
        moveZeroes(nums);
        print(nums);
    }
}
