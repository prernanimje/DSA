package com.bootcoding.dsa.linkedList;

public class Reverse {
    int data;
    Node next;


    public static Node creatLinkedList(){
        Node firstNode= new Node(10);
        Node secondNode= new Node(20);
        Node thirdNode= new Node(30);
        Node forthNode= new Node(40);

        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=null;
        return firstNode;
    }

    public static Node digits(Node head){
        Node current=head;
        Node next= null;
        Node prev= null;

        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void  printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data  + " -->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Node head = creatLinkedList();
       printLinkedList(head);
       Node node= digits(head);
       printLinkedList(node);

    }
}
