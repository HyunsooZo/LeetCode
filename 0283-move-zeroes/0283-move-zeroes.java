class Solution {
    public void moveZeroes(int[] nums) {
        int previous = 0;
        for (int next = 0; next < nums.length; next++) {
            if (nums[next] != 0) {
                int temp = nums[previous];
                nums[previous] = nums[next];
                nums[next] = temp;
                previous++;
            }
        }
    }
}