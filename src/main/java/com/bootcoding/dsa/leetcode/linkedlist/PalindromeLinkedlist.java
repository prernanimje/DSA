package com.bootcoding.dsa.leetcode.linkedlist;

import java.util.Collections;
import java.util.List;

public class PalindromeLinkedlist {
    public static void main(String[] args) {
      Node c=creatLinkedList();
        List agg= Collections.singletonList(isPalindrome(c));
        for (int i=0;i< agg.size();i++){
            System.out.println(agg.get(i));
        }
    }
    public static Node creatLinkedList(){
        Node firstNode= new Node(1);
        Node secondNode= new Node(2);
        Node thirdNode= new Node(2);
        Node forthNode= new Node(1);

        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=null;
        return firstNode;
    }
    public static boolean isPalindrome(Node head) {
        Node temp = head;
        int num = 0;
        int rev = 0;
        int mul = 1;

        while(temp != null) {

            num = num * 10 + temp.data;
            rev = rev + temp.data * mul;
            mul *= 10;

            temp = temp.next;
        }

        return num == rev;
    }
}
