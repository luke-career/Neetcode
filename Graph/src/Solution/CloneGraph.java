package Solution;

import java.util.HashMap;
import DataStructure.Node;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> visited = new HashMap<>();
        if(node == null) return null;

        return helper(node, visited);
    }

    private Node helper(Node node, HashMap<Node,Node> visited){
        if(visited.containsKey(node)) return visited.get(node);

        Node copyNewNode = new Node(node.val);

        visited.put(node,copyNewNode);

        for(Node n : node.neighbors){
            copyNewNode.neighbors.add(helper(n, visited));
        }

        return copyNewNode;
    }
}
