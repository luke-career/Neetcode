package Solution;


import DataStructure.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            second = second.next.next;
            first = first.next;
            if(second == first) return true;
        }
        return false;
    }
}
