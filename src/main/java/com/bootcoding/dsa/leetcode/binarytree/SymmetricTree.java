package com.bootcoding.dsa.leetcode.binarytree;

import java.util.Collections;
import java.util.List;

public class SymmetricTree {

    public static void main(String[] args) {
       TreeNode root=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        TreeNode n6=new TreeNode(6);

        root.left=n2;
        root.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;

        List agg= Collections.singletonList(isSymmetric(root));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        if(root.left==null &&root.right==null){
            return true;
        }

        if(root.left!=null && root.right!=null && root.left.val==root.right.val){
            return mirror(root.left,root.right);
        }
        return false;
    }

    public static boolean mirror(TreeNode left, TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null )
            return false;

        if(left.left!=null && right.right!=null && left.left.val!=right.right.val){
            return false;
        }
        if(left.right!=null && right.left!=null && left.right.val!=right.left.val)
            return false;

        return mirror(left.left,right.right) && mirror(left.right,right.left);

    }
}
