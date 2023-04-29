class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        
        int target = nums.length/2 , answer = 0;
        
        for(int i : nums){
            if(map.get(i)>target){
                answer = i;
            }
        } 
        return answer;
    }
}