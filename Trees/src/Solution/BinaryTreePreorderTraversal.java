package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;

    }

    private void helper(TreeNode root, List list){
        if(root == null) return;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}
