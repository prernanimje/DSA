package com.bootcoding.dsa.Tree;

public class fullTree {
    public static boolean full(Node root){
        if(root==null){
            return true;
        }if((root.left==null) && (root.right==null)){
            return true;
        }
        if ((root.left!=null) && (root.right!=null) &&
                full(root.left) && full(root.right)){
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
         Node n9 = new Node(9);


        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;

        System.out.println(full(root));

    }
}
