package com.bootcoding.dsa.linkedList;


public class duplicate {

    public static Node creatLinkedList() {
        Node firstNode = new Node(22);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(22);
        Node fourthNode = new Node(7);


        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return firstNode;
    }

    public static void printDuplicate(Node head) {
        Node temp = head;
        Node temp2 = temp.next;
        int duoCount = 0;
        while (temp.next != null) {
            while (temp2 != null) {
                if (temp.data == temp2.data) {
                    System.out.println(temp.data + " ");
                   return;
                }
                temp2 = temp2.next;
            }
             temp=temp.next;
        }
            System.out.println();

    }

        public static void main (String[]args){
            Node head = creatLinkedList();
            printDuplicate(head);
        }

    }

