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
        Queue<Node> parentQueue = new ArrayDeque<>();
        parentQueue.add(root);
        int depth = 0;
        while(!parentQueue.isEmpty()) {
            Queue<Node> childQueue = new ArrayDeque<>();
            while(!parentQueue.isEmpty()) {
                Node curr = parentQueue.poll();
                curr.children.forEach(el -> {
                    childQueue.add(el);
                });
            }
            parentQueue = childQueue;
            depth += 1;
        }
        return depth;
    }
}