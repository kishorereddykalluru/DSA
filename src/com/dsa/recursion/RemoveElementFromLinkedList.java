package com.dsa.recursion;

public class RemoveElementFromLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode removeElement(ListNode head, int val) {

        if(head == null){
            return null;
        }
       head.next = removeElement(head.next, val);
        return head.val == val ? head.next : head;
    }

    public void display(ListNode head) {
        ListNode curNode = head;

        while(curNode != null) {
            System.out.print(curNode.val + "-> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        RemoveElementFromLinkedList remove = new RemoveElementFromLinkedList();
        ListNode removeElement = remove.removeElement(list1, 2);
        remove.display(removeElement);

    }
}
