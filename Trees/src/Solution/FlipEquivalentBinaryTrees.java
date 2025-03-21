package Solution;

import dataStructure.TreeNode;

public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        boolean res = helper(root1,root2);
        return res;
    }

    private boolean helper(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null && root2 != null) return false;
        if(root1 != null && root2 == null) return false;

        if(root1.val == root2.val) {
            boolean l = helper(root1.left,root2.right) && helper(root1.right,root2.left);
            boolean r =  helper(root1.left,root2.left) && helper(root1.right,root2.right);
            return l || r;
        }
        return false;
    }
}
