package Solution;

import dataStructure.TreeNode;

public class MinimumDistanceBetweenBSTNodes {
    int min = Integer.MAX_VALUE;
    Integer pre = null;

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return min;
    }

    private void helper(TreeNode root) {

        if (root == null)
            return;
        helper(root.left);
        if (pre != null) {
            min = Math.min((root.val - pre), min);

        }
        pre = root.val;

        helper(root.right);
    }
}
