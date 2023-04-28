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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        traversal(p, list1);
        traversal(q, list2);
        return list1.equals(list2)?true:false;
    }
    public static void traversal(TreeNode tree, List<Integer> list){
        if(tree == null) {
            list.add(null);
            return;
        }
        list.add(tree.val);
        traversal(tree.left,list);
        traversal(tree.right,list);
    }
}