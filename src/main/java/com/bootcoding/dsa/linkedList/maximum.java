package com.bootcoding.dsa.linkedList;

public class maximum {
    public static Node creatLinkedList() {
        Node firstNode = new Node(20);
        Node secondNode = new Node(42);
        Node thirdNode = new Node(89);
        Node forthNode = new Node(82);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return firstNode;
    }

    public static void maximumNumber(Node head){
        Node temp= head;

        while(temp!=null){
            int max=temp.next.data;
            if(temp.data > max){
                System.out.println(temp.data + " ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head= creatLinkedList();
        maximumNumber(head);
    }
}
