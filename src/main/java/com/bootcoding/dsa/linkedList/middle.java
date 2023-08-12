package com.bootcoding.dsa.linkedList;

public class middle {
    public static Node creatLinkedList(){
        Node firstNode= new Node(1);
        Node secondNode= new Node(2);
        Node thirdNode= new Node(3);
        Node forthNode= new Node(4);
        Node fifthNode= new Node(5);
        Node sixthNode= new Node(6);

        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=null;
        return firstNode;
    }
    public static void  printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data  + " -->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node middleNode(Node head) {

        Node temp = head;
        int count=0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = count / 2;
        temp = head;
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
            System.out.println(middle);
        }
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Node n=creatLinkedList();
        middleNode(n);
       /*while (n!=null){
           System.out.println(n.data + " ");
           n=n.next;
       }*/
    }

}
//2095 2130 :- leap code
