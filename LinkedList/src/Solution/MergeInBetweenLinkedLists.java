package Solution;

import DataStructure.ListNode;

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        ListNode p = list1;
        ListNode start = dummy;
        for(int i = 0 ; i < a; i++){
            start = p;
            p = p.next;
        }
        p = list1;
        ListNode end = dummy;
        for(int i = 0; i <= b; i++){
            end = p;
            p = p.next;
        }

        end = p;


        start.next = list2;

        ListNode l = list2;
        while(l.next != null){
            l = l.next;
        }

        l.next = end;
        return dummy.next;
    }
}
