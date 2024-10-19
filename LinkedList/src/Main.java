
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode p = new ListNode();
        while(p !== null){
            p = head.next;
            p.next = head;
            head.next = null;
            p = p.next;
        }
        return p.next;
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}