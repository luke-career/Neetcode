package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        boolean leftToright = true;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode r = queue.poll();
                if (r.left != null) {
                    queue.offer(r.left);
                }
                if (r.right != null) {
                    queue.offer(r.right);
                }

                if (leftToright) {
                    list.add(r.val);
                } else {
                    list.add(0, r.val);
                }
            }
            leftToright = !leftToright;
            res.add(list);
        }
        return res;
    }
}
