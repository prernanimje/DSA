package com.bootcoding.dsa.geeksforgeeks.Binarytree;

import com.bootcoding.dsa.Search.tree.TreeNode;
import com.bootcoding.dsa.Tree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreOrderTree {

    public static void main(String[] args) {
        com.bootcoding.dsa.Search.tree.TreeNode root=new com.bootcoding.dsa.Search.tree.TreeNode(1);
        com.bootcoding.dsa.Search.tree.TreeNode n2=new com.bootcoding.dsa.Search.tree.TreeNode(2);
        com.bootcoding.dsa.Search.tree.TreeNode n3=new com.bootcoding.dsa.Search.tree.TreeNode(3);
        com.bootcoding.dsa.Search.tree.TreeNode n4=new com.bootcoding.dsa.Search.tree.TreeNode(4);
        com.bootcoding.dsa.Search.tree.TreeNode n5=new com.bootcoding.dsa.Search.tree.TreeNode(5);
        com.bootcoding.dsa.Search.tree.TreeNode n6=new TreeNode(6);

        root.left=n2;
        root.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        List arr = Collections.singletonList(preorder(root));
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
    static ArrayList<Integer> preorder(TreeNode root)
    {
        ArrayList<Integer> list= new ArrayList<>();
        helper(root,list);
        return list;

    }
    private static void  helper(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
    }
}
