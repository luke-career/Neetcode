package Solution;

import DataStructure.ListNode;

import java.util.Stack;

public class PalindromeLinkedListSolution1 {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }

        while(!st.isEmpty()){
            if(st.pop().val != head.val){
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
