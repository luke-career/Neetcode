package Solution;

import dataStructure.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum,0);
    }

    public boolean helper(TreeNode root, int targetSum,int currentSum){
        if(root == null) return false;
        currentSum += root.val;
        if(root.left == null && root.right == null && currentSum == targetSum) return true;
        return helper(root.left,targetSum, currentSum) || helper(root.right,targetSum,currentSum);
    }
}
