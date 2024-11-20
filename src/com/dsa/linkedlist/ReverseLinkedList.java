package com.dsa.linkedlist;

public class ReverseLinkedList {



    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();

        list.head = reverseLinkedList(list.head);

        list.display();


    }

    private static LinkedList.Node reverseLinkedList(LinkedList.Node head) {

        LinkedList.Node cur = head;
        LinkedList.Node prev = null;

        while(cur!=null) {
            LinkedList.Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
