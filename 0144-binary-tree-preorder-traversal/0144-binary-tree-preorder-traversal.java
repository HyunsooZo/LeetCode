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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        actualTraversal(answer,root);
        return answer;
    }
    public static void actualTraversal(List<Integer> list,TreeNode root){
        if(root == null) return;
        
        list.add(root.val);
        actualTraversal(list,root.left);
        actualTraversal(list,root.right);
    }
}