package com.bootcoding.dsa.Array;

public class DBsum {
    public static int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]>9) {
                while(nums[j]!=0) {
                    int div = nums[j] % 10;
                    nums[j]=div;
                    nums[j] = nums[j] / 10;
                }
                digitsum=digitsum+nums[j];
            }
            System.out.println(sum-digitsum);
            break;
        }

        return Math.abs(sum-digitsum);
    }
    public static void printArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }

    public static void main(String[] args) {
        int [] nums={1,15,6,3};
        int head=differenceOfSum(nums);
        System.out.println(head);

    }


}
