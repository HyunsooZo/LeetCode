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
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){ 
            return answer;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0 ; i < len ; i++){
                TreeNode temp = q.poll();
                tempList.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }   
                if(temp.right!= null){
                    q.offer(temp.right);
                }
                
            }
            answer.add(tempList);
        }
        return answer;
    }
}