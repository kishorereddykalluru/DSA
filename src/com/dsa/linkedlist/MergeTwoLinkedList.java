package com.dsa.linkedlist;

public class MergeTwoLinkedList {

      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode mergeList = null;

            while (list1 != null && list2 != null) {
                int data = 0;
                if (list1.val < list2.val) {
                    data = list1.val;
                    list1 = list1.next;
                } else {
                    data = list2.val;
                    list2 = list2.next;
                }
               mergeList = getListNode(mergeList, data);
            }

            while(list1!=null) {
                mergeList = getListNode(mergeList, list1.val);
                list1 = list1.next;
            }

            while(list2 != null) {
                mergeList = getListNode(mergeList, list2.val);
                list2 = list2.next;
            }
            return mergeList;
        }

    private static ListNode getListNode(ListNode mergeList, int data) {
        if(mergeList == null) {
            mergeList = new ListNode(data);
        } else {
            ListNode curr = mergeList;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(data);
        }
        return mergeList;
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
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(6);
        ListNode list2 = new ListNode(0);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(7);

        MergeTwoLinkedList mergeTwoLinkedList = new MergeTwoLinkedList();
        //ListNode merged = mergeTwoLinkedList.mergeTwoLists(list1, list2);

        //mergeTwoLinkedList.display(merged);

        ListNode mergeBetterSol = mergeTwoLinkedList.betterSol(list1, list2);
        mergeTwoLinkedList.display(mergeBetterSol);
    }

    private ListNode betterSol(ListNode list1, ListNode list2) {
          ListNode dummy = new ListNode(0);
          ListNode current = dummy;

          while(list1!=null && list2!=null) {
              if(list1.val < list2.val) {
                  current.next = new ListNode(list1.val);
                  list1 = list1.next;
              } else {
                  current.next = new ListNode(list2.val);
                  list2 = list2.next;
              }
              current = current.next;
          }

          if(list1!=null) current.next = list1;
          else current.next=list2;

          return dummy.next;
    }
}
