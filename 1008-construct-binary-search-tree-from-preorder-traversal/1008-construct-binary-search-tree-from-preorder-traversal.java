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
    private int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private TreeNode buildTree(int[] preorder,  int min, int max) {
        if (idx >= preorder.length || 
            preorder[idx] < min || 
            preorder[idx] > max) return null;
        
        TreeNode node = new TreeNode(preorder[idx++]);
                
        node.left = buildTree(preorder,  min, node.val);
        node.right = buildTree(preorder,  node.val, max);
        
        return node;
    }
}
