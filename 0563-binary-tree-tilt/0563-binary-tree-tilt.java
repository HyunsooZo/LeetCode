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
    private int answer = 0;
    
    public int findTilt(TreeNode root) {
        calculateTilt(root);
        return answer;
    }
    
    public int calculateTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftSum = calculateTilt(root.left);
        int rightSum = calculateTilt(root.right);
        
        answer += Math.abs(leftSum - rightSum);
        
        return leftSum + rightSum + root.val;
    }
}
