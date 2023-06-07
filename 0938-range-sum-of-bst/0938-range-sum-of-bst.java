class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        if (root.val < low)  return rangeSumBST(root.right, low, high);
        else if (root.val > high) return rangeSumBST(root.left, low, high);
        else {
            int leftSum = rangeSumBST(root.left, low, high);
            int rightSum = rangeSumBST(root.right, low, high);
            return root.val + leftSum + rightSum;
        }
    }
}
