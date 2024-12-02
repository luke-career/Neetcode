package Solution;

import dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String, Integer> map = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        helper(root,map,res);
        return res;
    }

    private String helper(TreeNode root, Map<String, Integer> map, List<TreeNode> res) {
        if (root == null)
            return "#";
        String st = helper(root.left, map, res) + ',' + helper(root.right, map, res) +',' + root.val  ;
        map.put(st, map.getOrDefault(st, 0) + 1);

        if (map.getOrDefault(st, 0) == 2) {
            res.add(root);
        }

        return st;
    }
}
