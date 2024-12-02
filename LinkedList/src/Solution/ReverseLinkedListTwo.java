package Solution;

import DataStructure.ListNode;

public class ReverseLinkedListTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode  pre = dummy;

        for(int i = 1; i < left ; i++){
            pre = pre.next;
        }

        ListNode start = pre.next;
        ListNode then = start.next;

        for(int i = 1 ; i <= right -left; i++){
            ListNode p = then.next;
            then.next = pre.next;
            pre.next = then;
            start.next = p;
            then = p;
        }

        return dummy.next;
    }
}
