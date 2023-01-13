package com.bootcoding.dsa.linkedList;

public class Node {
    int data;
    Node next;

    public Node (int data){
      this.data=data;
      this.next=null;
    }
    public static Node creatLinkedList(){
        Node firstNode= new Node(20);
        Node secondNode= new Node(42);
        Node thirdNode= new Node(89);
        Node forthNode= new Node(82);

        Node head= firstNode;
        head.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=null;
        return head;
    }

    public static void  printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {


            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        creatLinkedList();
        printLinkedList(creatLinkedList());

    }
}

