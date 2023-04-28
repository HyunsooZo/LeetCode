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
    public int maxDepth(TreeNode root) {
        return checkingDepth(root, 0);
    }
    
    private int checkingDepth(TreeNode root, int prevDepth) {
        if (root == null) {
            return prevDepth;
        }
        
        int leftDepth = checkingDepth(root.left, prevDepth + 1);
        int rightDepth = checkingDepth(root.right, prevDepth + 1);
        
        return Math.max(leftDepth, rightDepth);
    }
}
