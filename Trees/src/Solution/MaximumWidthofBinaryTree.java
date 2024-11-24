package Solution;

import dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        int max = -1;

        while(!queue.isEmpty()){
            int size = queue.size();
            int leftMost = queue.peek().index;
            int rightMost = leftMost;
            for(int i = 0 ; i < size; i++){
                Pair p = queue.poll();
                TreeNode tn = p.treeNode;
                int index = p.index;
                if(i == 0) leftMost = index;
                if(i == size - 1) rightMost = index;

                if(tn.left != null) {
                    queue.offer(new Pair(tn.left, 2 * index));
                }

                if(tn.right != null){
                    queue.offer(new Pair(tn.right, 2 * index + 1));
                }
            }
            max = Math.max(rightMost - leftMost + 1, max);
        }
        return max;
    }

    private class Pair{
        TreeNode treeNode;
        int index;

        private Pair(TreeNode treeNode, int index){
            this.treeNode = treeNode;
            this.index = index;
        }
    }
}
