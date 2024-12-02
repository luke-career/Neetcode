package Solution;

import DataStructure.ListNode;

public class RemoveNodesFromLinkedList {
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode reverseHead = reverseNode(head);
            ListNode dummy = new ListNode(0);
            int max = Integer.MIN_VALUE;
            dummy.next = reverseHead;
            ListNode prev = dummy;
            while(reverseHead != null){
                max = Math.max(reverseHead.val,max);
                if(reverseHead.val < max){
                    prev.next = reverseHead.next;
                }else{
                    prev = reverseHead;
                }
                reverseHead = reverseHead.next;
            }

            ListNode res = dummy.next;
            return reverseNode(res);
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
}
