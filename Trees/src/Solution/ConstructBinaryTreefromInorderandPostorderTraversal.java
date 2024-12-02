package Solution;

import dataStructure.TreeNode;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        TreeNode  root = helper(0,len - 1, 0 , len - 1, inorder, postorder);
        return root;
    }

    private TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder){

        if(inStart > inEnd) return null;
        int rootIndex = - 1;
        for(int i = inStart ; i <= inEnd ; i++){
            if(inorder[i] == postorder[postEnd]){
                rootIndex = i;
            }
        }

        TreeNode root = new TreeNode(postorder[postEnd]);

        int leftTree = rootIndex - inStart;

        root.left = helper(inStart,rootIndex - 1, postStart, postStart + leftTree - 1, inorder, postorder);
        root.right = helper(rootIndex + 1, inEnd,postStart + leftTree, postEnd - 1, inorder , postorder);

        return root;
    }
}
