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
import java.util.*;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        return findSum(root, k, list);
    }

    private boolean findSum(TreeNode node, int k, List<Integer> list) {
        if (node == null)  return false;

        if (list.contains(k - node.val)) return true;

        list.add(node.val);

        return findSum(node.left, k, list) || findSum(node.right, k, list);
    }
}
