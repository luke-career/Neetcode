package Test;
import DataStructure.ListNode;
import Solution.MergeTwoLists;

public class MergeTwoListsTest {
    public static void  main(String args[]){
        ListNode l7 = new ListNode(7,null);
        ListNode l5 = new ListNode(5,l7);
        ListNode l3 = new ListNode(3,l5);
        ListNode l1 = new ListNode(1,l3);

        ListNode l10 = new ListNode(8,null);
        ListNode l8 = new ListNode(8,l10);
        ListNode l6 = new ListNode(6,l8);
        ListNode l4 = new ListNode(4,l6);
        ListNode l2 = new ListNode(2,l4);

        MergeTwoLists test = new MergeTwoLists();
        ListNode result = test.mergeTwoLists(l1,l2);


    }
}
