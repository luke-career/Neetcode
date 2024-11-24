package Solution;

import dataStructure.TreeNode;

public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode root) {
        return helper(root);
    }

    private String helper(TreeNode root) {
        if (root == null)
            return "";

        String result = String.valueOf(root.val);

        if (root.left != null && root.right != null) {
            result = result+ "(" + helper(root.left) + ")" + "(" + helper(root.right) +")";
        }

        if(root.left != null && root.right == null){
            result = result + "("+ helper(root.left) + ")";
        }
        if (root.left == null && root.right != null) {
            result = result + "()" + "(" + helper(root.right) + ")";
        }

        return result;
    }
}
