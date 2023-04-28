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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depthCheck(root);
    }
    public static int depthCheck(TreeNode root){
        if(root.left==null && root.right == null ){
            return 1;
        }
        
        int i = Integer.MAX_VALUE;
        if(root.left!=null){
            i = depthCheck(root.left);
        }
        
        int j = Integer.MAX_VALUE;
        if(root.right!=null){
            j = depthCheck(root.right);
        }
        
        return Math.min(i,j)+1;
    } 
}