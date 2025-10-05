package com.dsa.linkedlist;

public class RemoveDuplicatesFromSortedList {

      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      public ListNode deleteDuplicates(ListNode head) {

          if(head == null)
              return null;

          ListNode current = head;
          while(current!=null && current.next != null) {
              if(current.val == current.next.val) {
                  current.next = current.next.next;
              } else {
                  current = current.next;
              }
          }
          return head;
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
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(1);

        RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();
        ListNode listNode = remove.deleteDuplicates(list1);

        remove.display(listNode);

    }

}
