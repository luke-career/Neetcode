package Solution;

import dataStructure.TreeNode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root =    helper(0,preorder.length - 1,0,inorder.length - 1,preorder,inorder);
        return root;


    }

    private TreeNode helper (int preStart ,int preEnd, int inStart,int inEnd , int[] preorder,int[] inorder ){
        if(preStart > preEnd || inStart > inEnd) return null;

        int rootIndex = -1;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == preorder[preStart]){
                rootIndex = i;
            }
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int leftSubtreeSize = rootIndex - inStart;

        root.left = helper(preStart + 1, preStart + leftSubtreeSize,inStart,rootIndex - 1,preorder,inorder);
        root.right = helper(preStart + leftSubtreeSize + 1,preEnd,rootIndex+1,inEnd,preorder,inorder);

        return root;
    }
}
