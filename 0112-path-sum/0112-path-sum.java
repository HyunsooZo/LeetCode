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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return judge(root,targetSum,0);
    }
    public static boolean judge(TreeNode root, int targetSum, int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(root.left == null && root.right ==null && targetSum==sum){
            return true;
        }
        
        return judge(root.left,targetSum,sum) || judge(root.right,targetSum,sum);
    }
}