package com.bootcoding.dsa.linkedList;

public class Even {
    int data;
    Even next;

    public  Even (int data){
        this.data=data;
        this.next=null;
    }

    public static Node creatLinkedList(){
         Node firstNode = new Node(22);
         Node secondNode = new Node(4);
         Node thirdNode = new Node(2);
         Node fourthNode = new Node(7);

         Node head= firstNode;
         firstNode.next = secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=null;
        return firstNode;
    }

    public static void evenNumber(Node head){
        Node temp= head;

           while (temp!=null) {
               if (temp.data % 2 == 0) {
                   System.out.println(temp.data+ " ");

               }
               temp=temp.next;

           }
            System.out.println();
        }


    public static void main(String[] args) {
       Node head= creatLinkedList();
       evenNumber(head);

    }
    }

