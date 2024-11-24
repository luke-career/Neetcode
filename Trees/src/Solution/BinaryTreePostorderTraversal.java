package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        helper(root,res);
        return res;

    }

    private void helper(TreeNode root, List res){
        if(root == null) return ;
        helper(root.left,res);
        helper(root.right,res);
        res.add(root.val);
    }
}

