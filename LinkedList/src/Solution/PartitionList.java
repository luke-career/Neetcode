package Solution;

import DataStructure.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode greatHead = new ListNode(0);
        ListNode great =greatHead;
        ListNode less = lessHead;
        ListNode p = head;

        while(p != null){
            if(p.val < x){
                lessHead.next = p;
                p = p.next;
                lessHead = lessHead.next;
            }else{
                greatHead.next = p;
                p = p.next;
                greatHead = greatHead.next;
            }
        }

        lessHead.next = great.next;
        greatHead.next = null;
        return less.next;

    }
}
