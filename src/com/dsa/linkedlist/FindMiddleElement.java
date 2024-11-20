package com.dsa.linkedlist;

public class FindMiddleElement {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        //list.insert(8);

        list.display();

        LinkedList.Node node = findMiddleElement(list.head);

        System.out.println(node.data);


    }

    private static LinkedList.Node findMiddleElement(LinkedList.Node head) {

       LinkedList.Node slow = head;
       LinkedList.Node fast = head;

       while(fast!=null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
       }

       return slow;
    }
}
