package Solution;
import dataStructure.TreeNode;



public class ConvertSortedArraytoBinarySearchTree {
    public dataStructure.TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        dataStructure.TreeNode res = helper(start, end, nums);
        return res;

    }

    private TreeNode helper(int start, int end, int[] nums) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = helper(start, mid - 1, nums);
        current.right = helper(mid + 1, end, nums);
        return current;
    }
}
