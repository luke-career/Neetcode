import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;



public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (i < size - 1) {
                    Node next = queue.peek();
                    current.next = next;
                } else if (i == size - 1) {
                    current.next = null;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return root;
    }
}
