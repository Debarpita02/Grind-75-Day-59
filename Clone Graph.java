import java.util.*;

public class Solution {
    private Map<Integer, Node> visitedNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (visitedNodes.containsKey(node.val)) {
            return visitedNodes.get(node.val);
        }

        Node cloneNode = new Node(node.val);
        visitedNodes.put(node.val, cloneNode);

        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }
}
