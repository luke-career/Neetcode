package Solution;

import dataStructure.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode res = helper(root1,root2);
        return res;
    }

    private TreeNode helper(TreeNode root1, TreeNode root2){
        if(root1 == null ) return root2;
        if(root2 == null) return root1;

        TreeNode current = new TreeNode(root1.val + root2.val);
        current.left = helper(root1.left,root2.left);
        current.right = helper(root1.right,root2.right);

        return current;

    }
}
