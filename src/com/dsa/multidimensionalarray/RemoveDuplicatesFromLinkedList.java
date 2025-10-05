package com.dsa.multidimensionalarray;

import com.dsa.linkedlist.RemoveElementFromLinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void display(Node head) {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.print("null");
    }

    public Node removeDuplicates(Node head) {
        if(head == null)
            return head;

        Node cur = head;
        Node prev = null;
        Set<Integer> hashSet = new HashSet<>();

        while(cur != null) {
            if(!hashSet.add(cur.val)) {
                prev.next = cur.next;
            } else {
                hashSet.add(cur.val);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        RemoveDuplicatesFromLinkedList rm = new RemoveDuplicatesFromLinkedList();
        //rm.display(head);

        Node removeDuplicates = rm.removeDuplicates(head);
        rm.display(removeDuplicates);

    }
}
