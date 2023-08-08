package com.bootcoding.dsa.leetcode.binarytree;

import com.bootcoding.dsa.Search.tree.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
       int nums[]={-10,-3,0,5,9};


    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }
    private static TreeNode createBST(int nums[],int left,int right){
        if(left>right)return null;
        int m=(left+right)/2;
        TreeNode root=new TreeNode(nums[m]);
        root.left=createBST(nums,left,m-1);
        root.right=createBST(nums,m+1,right);

        return root;
    }
}
