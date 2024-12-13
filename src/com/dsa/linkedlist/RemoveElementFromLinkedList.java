package com.dsa.linkedlist;

public class RemoveElementFromLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteFromLast(ListNode head) {

        if(head == null)
            return null;

        ListNode cur = head;

        while(cur.next != null) {
            if(cur.next.next == null) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
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
        //ListNode listNode = remove.deleteFromLast(list1);
        //ListNode listNode1 = remove.deleteFromFirst(list1);
        ListNode removeElement = remove.removeElement(list1, 2);

        //remove.display(listNode);
        remove.display(removeElement);

    }

    private ListNode deleteFromFirst(ListNode head) {

        if(head == null || head.next == null)
            return null;

        return head.next;
    }
}
