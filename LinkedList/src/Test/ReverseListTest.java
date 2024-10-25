package Test;


import DataStructure.ListNode;
import Solution.ReverseList;

import java.util.Arrays;

public class ReverseListTest {
    public static void  main(String args[]){
        ListNode p1 = new ListNode(122,null);
        ListNode p2 = new ListNode(11,p1);
        ListNode p3 = new ListNode(22,p2);
        ListNode head = new ListNode(44,p3);

        // Original linked list
        System.out.println(Arrays.toString(listToArray(head)));
        ReverseList Test = new ReverseList();
        ListNode result = Test.reverseList(head);

        int[] test = listToArray(head);

        //After reverse
         System.out.println(Arrays.toString(listToArray(result)));
    }

    public static int[] listToArray(ListNode head){
        ListNode pointer = head;
        int length = 0;
        while(pointer != null){
            length++;
            pointer = pointer.next;
        }
        pointer = head;
        int[] arrayFormList = new int[length];
        for(int i = 0; i < length; i++){
            arrayFormList[i] = pointer.val;
            pointer = pointer.next;
        }
        return arrayFormList;
    }
}