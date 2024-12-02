package Solution;

import DataStructure.ListNode;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode l = sortList(head);
        ListNode r = sortList(mid);

        return merge(l, r);
    }

    private ListNode getMid(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;

        }
        if (pre != null) {
            pre.next = null;
        }
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode r = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                r.next = left;
                r = r.next;
                left = left.next;
            } else {
                r.next = right;
                r = r.next;
                right = right.next;
            }
        }
        if(left == null) r.next = right;
        if(right == null) r.next = left;
        return dummy.next;
    }
}
