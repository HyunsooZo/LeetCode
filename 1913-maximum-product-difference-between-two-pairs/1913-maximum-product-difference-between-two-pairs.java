import java.util.*;
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length -1 ;
        return (nums[last]*nums[last-1])-(nums[0]*nums[1]);
    }
}