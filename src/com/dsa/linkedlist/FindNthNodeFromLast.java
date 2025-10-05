package com.dsa.linkedlist;

public class FindNthNodeFromLast {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
        list1.next.next.next.next.next = new ListNode(6);

        FindNthNodeFromLast findNthNodeFromLast = new FindNthNodeFromLast();
        findNthNodeFromLast.display(list1);

        System.out.println(findNthNodeFromLast.findNthElement(list1, 3));
    }

    public int findNthElement(ListNode node, int k) {

        if(node == null)
            return -1;

        ListNode cur = node;
        ListNode p2 = node;

        for(int i = 0; i < k; i++) {
            p2 = p2.next;
            if(p2 == null) {
                return -1;
            }
        }

        while(p2 != null) {
            cur = cur.next;
            p2 = p2.next;
        }
        return cur.val;
    }
}
