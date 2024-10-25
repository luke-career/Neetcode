package Solution;

import  DataStructure.ListNode;


public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer = new ListNode(-1);
        ListNode header = pointer;


        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }
            else
            {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        if(list1 == null) pointer.next = list2;
        if(list2 == null) pointer.next = list1;
        return header.next;
    }
}

