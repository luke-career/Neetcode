package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueinEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        helper(root,res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode tn = queue.poll();
                max = Math.max(tn.val,max);
                if(tn.left != null){
                    queue.offer(tn.left);
                }
                if(tn.right != null){
                    queue.offer(tn.right);
                }
            }
            res.add(max);
        }
    }
}
