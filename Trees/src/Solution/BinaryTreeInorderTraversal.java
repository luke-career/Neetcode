package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res){
        if(root == null) return;
        helper(root.left,res);
        res.add(root.val);
        helper(root.right,res);
    }
}
