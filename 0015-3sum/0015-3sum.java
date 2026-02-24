class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int index = 0; index < length - 2; index++) {
            if (index > 0 && nums[index] == nums[index - 1]){
                continue;
            } 
            if (nums[index] > 0){
                break;
            }
            int left = index + 1;
            int right = length - 1;
            while (left < right) {
                long sum = (long) nums[index] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[index], nums[left], nums[right]));
                    int leftValue = nums[left];
                    int rightValue = nums[right];
                    while (left < right && nums[left] == leftValue){
                        left++;
                    }
                    while (left < right && nums[right] == rightValue){
                        right--;
                    } 
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}