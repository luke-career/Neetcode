package Solution;

import dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessofaBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        return helper(root);
    }

    public boolean helper(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean foundNull = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                if (p == null) {
                    foundNull = true;
                }else{
                    if(foundNull) return false;
                    queue.offer(p.left);
                    queue.offer(p.right);
                }
            }
        }
        return true;
    }
}
