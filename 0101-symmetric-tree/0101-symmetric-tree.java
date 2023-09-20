/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        
        if(root.left == null || root.right == null) {
            return false;
        }
        
        return checkIfNodesAreSame(root.left, root.right);
    }
    
    private boolean checkIfNodesAreSame(TreeNode left, TreeNode right) {
        if(left != null && right != null && left.val == right.val) {
            return checkIfNodesAreSame(left.right, right.left) && checkIfNodesAreSame(right.right, left.left);
        }
        if(left == null && right == null) {
            return true;
        }
        return false;
    }
}