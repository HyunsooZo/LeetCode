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
    static int standard;
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        standard = root.val;
        return helper(root);
    }
    public boolean helper(TreeNode node) {
        if (node == null) return true;
        if (node.val != standard) return false;
        return helper(node.left) && helper(node.right);
    }
}
