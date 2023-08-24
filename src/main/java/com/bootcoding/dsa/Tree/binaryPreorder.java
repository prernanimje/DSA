package com.bootcoding.dsa.Tree;

public class binaryPreorder {
    public static void preorder(Node root){
        int []a=new int[3];
        if(root==null){
            return ;
        }

        System.out.println(a);
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
       // int []node = {1,2,3};

        Node root= new Node(1);
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3 = new Node(3);

        root.right=n2;
        root.left=null;
        n2.left=n3;

        preorder(root);

    }
}
