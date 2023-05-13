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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Deque<TreeNode> q = new LinkedList<>();
        q.offerLast(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < len ; i++){
                TreeNode temp = q.pollFirst();
                list.add(temp.val);
                if(temp.left!=null) q.offerLast(temp.left);
                if(temp.right!=null) q.offerLast(temp.right);
            }
            result.add(list);
        }
        return result;
    }
}