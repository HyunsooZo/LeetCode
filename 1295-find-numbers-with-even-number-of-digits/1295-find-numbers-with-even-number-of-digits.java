class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for(int i : nums){
            int cnt = 0;
            while(i>0){
                i/=10;
                cnt++;
            }
            if(cnt%2==0){
                answer++;
            }
        }
        return answer;
    }
}