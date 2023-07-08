/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, 
                                        final TreeNode cloned, 
                                        final TreeNode target) {
        return finder(cloned,target);
    }
    public TreeNode finder(TreeNode head, TreeNode target) {
        if (head.val == target.val) {
            return head;
        }
        TreeNode result = null;
        if (head.left != null) {
            result = finder(head.left, target);
        }
        if (result != null) {
            return result;
        }
        if (head.right != null){
            result = finder(head.right, target);  
        } 
        return result;
    }
}