package com.dsa.linkedlist;

import com.dsa.recursion.RemoveElementFromLinkedList;

public class PalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode cur = head;
        ListNode prev = null;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        display(cur);
        display(prev);

        while(cur !=null) {
            if(cur.val == prev.val){
                cur = cur.next;
                prev = prev.next;
            } else {
                return false;
            }
        }



        return true;
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
        list1.next.next = new ListNode(1);
      //  list1.next.next.next = new ListNode(2);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean palindrome = palindromeLinkedList.isPalindrome(list1);

        System.out.println(palindrome);


    }
}
