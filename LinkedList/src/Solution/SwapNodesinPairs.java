package Solution;

import DataStructure.ListNode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;


        while(current != null && current.next != null){
            ListNode nextNode = current.next;
            ListNode third = nextNode.next;
            prev.next = nextNode;
            nextNode.next = current;
            current.next = third;
            prev = current;
            current = third;
        }
        return dummy.next;
    }
}
