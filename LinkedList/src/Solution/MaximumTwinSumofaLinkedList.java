package Solution;

import DataStructure.ListNode;

public class MaximumTwinSumofaLinkedList {
    public int pairSum(ListNode head) {
        ListNode left = head;
        ListNode mid = getMid(head);
        ListNode right = reverseNode(mid);

        int max = Integer.MIN_VALUE;

        while(left != null && right != null){
            max = Math.max(left.val + right.val,max);
            left = left.next;
            right = right.next;
        }

        return max;
    }

    private ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        prev.next = null;
        return slow;
    }
    private ListNode reverseNode(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        return prev;
    }
}
