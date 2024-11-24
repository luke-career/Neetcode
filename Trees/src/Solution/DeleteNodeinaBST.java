package Solution;

import dataStructure.TreeNode;

public class DeleteNodeinaBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root,key);
    }

    private TreeNode helper (TreeNode root,int key){
        if(root == null ) return null ;

        if(root.val == key){
            if(root.left == null && root.right != null){
                return root.right;
            }else if(root.right == null && root.left != null){
                return root.left;
            }else if(root.right != null && root.left != null) {
                TreeNode temp =  findSmallestNode(root.right);
                root.val = temp.val;
                root.right =  helper(root.right,temp.val);
            }else {
                return null;
            }

        }

        if(root.val > key){
            root.left = helper(root.left,key);
        }

        if(root.val < key){
            root.right = helper(root.right,key);
        }
        return root;
    }

    private TreeNode findSmallestNode(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
