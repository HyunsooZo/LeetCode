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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int a = heightCheck(root.left);
        int b = heightCheck(root.right);
        
        if(Math.abs(a-b)>1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    public static int heightCheck(TreeNode root){
        if(root==null) return -1;
        
        int i = heightCheck(root.left);
        int j = heightCheck(root.right);
        
        return Math.max(i,j)+1;
    }
}
