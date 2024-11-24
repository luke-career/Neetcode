package Solution;

import dataStructure.TreeNode;

public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }

    private boolean helper(TreeNode root){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(root.val == 1) return true;
            if(root.val == 0) return false;
        }
        if(root.val == 2){
            return helper(root.left) || helper(root.right);
        }
        if(root.val == 3){
            return helper(root.left) && helper(root.right);
        }
        return false;
    }
}
