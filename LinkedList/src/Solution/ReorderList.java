package Solution;

import DataStructure.ListNode;


public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middle = slow.next;
        slow.next = null;

        ListNode pre = null;
        ListNode current = middle;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        ListNode last = pre;
        ListNode first = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while(last != null){
            temp1 = first.next;
            temp2 = last.next;
            first.next = last;
            last.next = temp1;
            first = temp1;
            last = temp2;
        }
    }
}
