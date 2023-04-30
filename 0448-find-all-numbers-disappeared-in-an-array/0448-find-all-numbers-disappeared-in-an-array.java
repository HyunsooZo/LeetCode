class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        int[] chk  = new int[nums.length+1];
        
        for(int i : nums) chk[i]++;
        
        for(int i = 1 ; i< chk.length ; i++){
            if(chk[i]==0) answer.add(i);
        }
        return answer;
    }
}