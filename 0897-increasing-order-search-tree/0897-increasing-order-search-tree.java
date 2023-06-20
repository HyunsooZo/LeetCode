class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        TreeNode curr = dummy;
        
        inorderTraversal(root, curr);
        
        return dummy.right;
    }
    
    private TreeNode inorderTraversal(TreeNode node, TreeNode curr) {
        if (node == null) {
            return curr;
        }
        
        curr = inorderTraversal(node.left, curr);
        
        node.left = null;
        curr.right = node;
        curr = node;
        
        return inorderTraversal(node.right, curr);
    }
}
