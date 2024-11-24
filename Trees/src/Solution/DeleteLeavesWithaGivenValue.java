package Solution;

import dataStructure.TreeNode;

public class DeleteLeavesWithaGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        helper(root, target);
        return root;

    }

    private TreeNode helper(TreeNode root, int target) {
        if (root == null)
            return null;

        root.left = helper(root.left, target);
        root.right = helper(root.right, target);

        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }

        return root;

    }
}
