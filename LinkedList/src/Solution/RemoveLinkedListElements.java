package Solution;

import DataStructure.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;
        while (l != null && l.next != null) {
            if (l.next.val == val) {
                l.next = l.next.next;
            } else {
                l = l.next;
            }

        }
        return dummy.next;
    }
}
