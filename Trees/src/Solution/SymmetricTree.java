package Solution;

import dataStructure.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null && root2 != null) return false;
        if(root1 != null && root2 == null) return false;
        if(root1.val != root2.val) return false;
        return  helper(root1.left,root2.right) && helper(root1.right,root2.left);
    }
}
