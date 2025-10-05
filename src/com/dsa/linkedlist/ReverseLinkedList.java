package com.dsa.linkedlist;

public class ReverseLinkedList {



    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        //list.insert(5);

        list.display();

        list.head = reverseLinkedList(list.head);

        list.display();


    }

    private static LinkedList.Node reverseLinkedList(LinkedList.Node head) {

        if(head == null || head.next == null)
            return head;

        LinkedList.Node current = head;
        LinkedList.Node prev = null;

        while(current != null) {
            LinkedList.Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}
