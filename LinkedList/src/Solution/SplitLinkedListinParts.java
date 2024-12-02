package Solution;

import DataStructure.ListNode;

public class SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = getSize(head);
        int base = size / k;
        int extra = size % k;
        ListNode[] res = new ListNode[k];


        ListNode prev = null;
        ListNode current = head;


        ListNode start;

        for(int i = 0; i < k ; i++){
            start = current;
            int number = base + (i < extra ? 1 : 0);

            while(number > 0){
                prev = current;
                current = current.next;
                number--;
            }
            if(prev != null){
                prev.next = null;
            }
            prev = null;

            res[i] = start;

        }
        return res;
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
