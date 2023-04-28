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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildingTree(nums,0,nums.length-1);
    }
    public static TreeNode buildingTree(int[] nums, int left, int right){
        if( left > right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode answer = new TreeNode(nums[mid]);
        answer.left = buildingTree(nums,left,mid-1);
        answer.right = buildingTree(nums,mid+1,right);
    
        return answer;
    }
}