package com.bootcoding.dsa.leetcode.binarytree;

import java.util.Collections;
import java.util.List;

public class SumofLeftLeaves {
    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        TreeNode n2=new TreeNode(9);
       TreeNode n3=new TreeNode(20);
        TreeNode n4=new TreeNode(0);
        TreeNode n5=new TreeNode(0);
        TreeNode n6=new TreeNode(50);

        root.left=n2;
        root.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        List arr = Collections.singletonList(sumOfLeftLeaves(root));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            return root.left.val+ sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
