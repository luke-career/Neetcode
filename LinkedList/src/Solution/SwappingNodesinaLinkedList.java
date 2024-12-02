package Solution;

import DataStructure.ListNode;

public class SwappingNodesinaLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        int size = getSize(head);
        ListNode p = head;
        for(int i = 1 ; i < k; i++){
            p = p.next;
        }
        ListNode left = p;
        p = head;
        for(int i = 1; i < size - k + 1;i++ ){
            p = p.next;
        }
        ListNode right = p;

        int temp = right.val;
        right.val = left.val;
        left.val = temp;
        return head;
    }

    private int getSize(ListNode head){
        ListNode p = head;
        int size = 0;
        while(p != null){
            size++;
            p = p.next;
        }
        return size;
    }
}
