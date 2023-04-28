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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        recursive(root,answer);
        return answer;
    }
    public static void recursive(TreeNode root, List<Integer> answer){
        if(root==null) return;
        recursive(root.left,answer);
        answer.add(root.val);
        recursive(root.right,answer);
    }
}