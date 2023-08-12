package com.bootcoding.dsa.Array;

public class MergeTwoArray {
    public static void main(String[] args) {
       int [] nums1={1,2,3,0,0,0};
       int []nums2={2,3,6};
       merge(3,3,nums1, nums2);

    }

    private static void merge(int m, int n, int[] nums1, int[] nums2) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){
        if(i>=0 && nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }else {
            nums1[k--]=nums2[j--];
        }
            System.out.println(nums1[i]);
}
    }
}
