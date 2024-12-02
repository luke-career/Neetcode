package Solution;

import dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    class Solution {
        public boolean isEvenOddTree(TreeNode root) {
            return helper(root);
        }

        private boolean helper(TreeNode root){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int index = 0;
            while(!queue.isEmpty()){
                int size = queue.size();
                int premin = Integer.MIN_VALUE;
                int premax = Integer.MAX_VALUE;
                for(int i = 0; i < size;i++){
                    TreeNode r =  queue.poll();
                    if(index % 2 == 0){
                        if(r.val <= premin || r.val % 2 == 0) return false;
                        premin = r.val;
                    }else{
                        if(r.val >= premax || r.val % 2 == 1) return false;
                        premax = r.val;
                    }
                    if(r.left != null){
                        queue.offer(r.left);
                    }
                    if(r.right != null){
                        queue.offer(r.right);
                    }
                }
                index++;
            }
            return true;
        }
}
