package com.dsa.linkedlist;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        } else {
            Node curr = head;

            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void display() {
        Node curNode = head;

        while(curNode != null) {
            System.out.print(curNode.data + "-> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);


        list.display();
    }
}
 