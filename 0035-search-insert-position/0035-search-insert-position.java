class Solution {
    public int searchInsert(int[] nums, int target) {
        return recursive(nums,target,0,nums.length-1); 
    }
     public static int recursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return recursive(nums, target, mid + 1, right);
        } else {
            return recursive(nums, target, left, mid - 1);
        }
    }
}