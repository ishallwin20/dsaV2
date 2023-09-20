/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int depth = 0;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if(current.children != null) {
                    queue.addAll(current.children);
                }
            }

            depth += 1;
        }

        return depth;
    }
}