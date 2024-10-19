package Solution;

import DataStructure.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode current = head;
        ListNode nextCurrent = null;
        while(current != null){
            nextCurrent = current.next;
            current.next = pre;
            pre = current;
            current = nextCurrent;
        }
        return  pre;
    }
}
