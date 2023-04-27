class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i : nums) set.add(i);
        int idx = 0;
        for(int i : set) nums[idx++]=i;
        return set.size();
    }
}