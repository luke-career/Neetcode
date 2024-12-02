package Solution;

import DataStructure.ListNode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        // dummy.next = head;
        ListNode p = head;

        while (p != null) {
            ListNode prev = dummy;
            ListNode current = p.next;

            while (prev.next != null && p.val > prev.next.val) {
                prev = prev.next;
            }

            p.next = prev.next;
            prev.next = p;

            p = current;
        }
        return dummy.next;
    }
}
