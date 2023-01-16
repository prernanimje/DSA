package com.bootcoding.dsa.linkedList;

public class minimum {


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

    public static void minimum(Node head){
        Node temp=head;
        int min=temp.next.data;
    while(temp!=null){
        if (temp.data <min){
            System.out.println(temp.data + " ");
        }
        temp=temp.next;

    }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head=creatLinkedList();
        minimum(head);
    }
}
