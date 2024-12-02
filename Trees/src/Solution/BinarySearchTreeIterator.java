package Solution;

import dataStructure.TreeNode;

import java.util.Stack;

public class BinarySearchTreeIterator {

    Stack<TreeNode> st;

    public BinarySearchTreeIterator (TreeNode root) {
        st = new Stack<TreeNode>();
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    public int next() {
        int res = st.peek().val;
        TreeNode n = st.pop();
        if (n.right != null) {
            pushLeft(n.right);
        }
        return res;

    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    private void pushLeft(TreeNode n){
        while(n != null){
            st.push(n);
            n = n.left;
        }
    }
}
