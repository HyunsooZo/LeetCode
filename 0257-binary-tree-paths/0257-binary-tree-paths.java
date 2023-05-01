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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        StringBuilder elem = new StringBuilder();
        appending(root, answer, elem);
        return answer;
    }

    public void appending(TreeNode root, List<String> answer, StringBuilder elem) {
        if (root == null) {
            return;
        }
        elem.append(root.val);

        if (root.left == null && root.right == null) {
            answer.add(elem.toString());
            return;
        }

        elem.append("->");
        appending(root.left, answer, new StringBuilder(elem));
        appending(root.right, answer, new StringBuilder(elem));
    }
}
