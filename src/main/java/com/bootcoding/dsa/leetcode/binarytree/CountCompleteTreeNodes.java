package com.bootcoding.dsa.leetcode.binarytree;

import com.bootcoding.dsa.Search.tree.TreeNode;

import java.util.Collections;
import java.util.List;

public class CountCompleteTreeNodes {

    int data;
    TreeNode right;
    TreeNode left;
    //leetcode no 222
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
        List arr = Collections.singletonList(countNodes(root));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }


    }
    public static int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftn= countNodes(root.right);
        int rightn=countNodes(root.left);
        int totaln=leftn+rightn+1;
        return totaln;
    }
    public  void TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
