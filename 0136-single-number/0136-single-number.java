class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length ==1 ){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map.get(i)==1){
             return i;
            }
        }
        return 0;
    }
}