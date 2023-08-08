package com.bootcoding.dsa.linkedList;

import com.bootcoding.dsa.EveningArray.OddElementInReverse;

public class DeleteMiddle {
    public static Node creatLinkedList(){
        Node firstNode = new Node(1);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(7);
        Node fifthNode = new Node(1);
        Node sixthNode = new Node(5);
        Node seventhNode = new Node(6);

        Node head= firstNode;
        firstNode.next = secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=seventhNode;
        seventhNode.next=null;
        return firstNode;
    }
    public static Node deleteMiddle(Node head) {
        Node temp=head;
        int count=0;
        if(head == null || head.next == null)
            return null;

        while(temp!=null){
            count++;
            temp= temp.next;
        }
        temp=head;
        int mid=count/2;

        for(int i = 0; i < mid; i++){
            if(i == (mid - 1)){
                Node t = temp.next.next;
                temp.next = t;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node c=creatLinkedList();
       deleteMiddle(c);
    }
}
