package Solution;

import DataStructure.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode p = head;
        int size = 1;
        while(p.next != null){
            p = p.next;
            size++;
        }
        p.next = head;
        p = head;
        int temp = size  -  k % size;
        while(temp > 1){
            p = p.next;
            temp--;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}
