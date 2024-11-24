package Solution;

import dataStructure.TreeNode;

public class InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return helper(root,val);
    }

    private TreeNode helper(TreeNode root, int val){
        if(root == null ) return new TreeNode(val);
        if(val > root.val) {
            root.right = helper(root.right,val);
        }

        if(val < root.val) {
            root.left = helper(root.left,val);
        }
        return root;
    }
}
