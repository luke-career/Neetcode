package Solution;

import DataStructure.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode l = head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow;
        ListNode pre = null;


        while(current != null){
            ListNode nextNode = current.next;
            current.next = pre;
            pre = current;
            current = nextNode;
        }

        while(pre != null){
            if(l.val != pre.val){
                return false;
            }
            l = l.next;
            pre = pre.next;
        }
        return true;
    }
}
