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
        Set<Integer> set = new HashSet<>();
        return findSum(root, k, set);
    }

    private boolean findSum(TreeNode node, int k, Set<Integer> set) {
        if (node == null)  return false;

        if (set.contains(k - node.val)) return true;

        set.add(node.val);

        return findSum(node.left, k, set) || findSum(node.right, k, set);
    }
}
