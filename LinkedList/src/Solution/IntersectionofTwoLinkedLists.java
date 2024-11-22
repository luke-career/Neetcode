package Solution;

import DataStructure.ListNode;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l = headA;
        ListNode r = headB;

        while (l != r) {
            if (l == null) {
                l = headB;
            } else {
                l = l.next;
            }
            if (r == null) {
                r = headA;
            }else{
                r = r.next;
            }
        }
        return l;
    }
}
