package Solution;

import DataStructure.ListNode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = head;
        while (l != null && l.next != null) {
            if (l.next.val == l.val) {
                l.next = l.next.next;
            }else{
                l = l.next;
            }
        }
        return head;
    }
}
