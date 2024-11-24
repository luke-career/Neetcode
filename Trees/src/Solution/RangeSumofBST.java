package Solution;

import dataStructure.TreeNode;

public class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root, low, high);
    }

    private int helper(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        int currentSum = 0;
        if (root.val >= low && root.val <= high) {
            currentSum += root.val;
        }
        return currentSum + helper(root.left, low, high) + helper(root.right, low, high);

    }
}
