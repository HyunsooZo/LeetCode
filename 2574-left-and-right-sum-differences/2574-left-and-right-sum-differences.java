class Solution {
    public int[] leftRightDifference(int[] nums) {
          int[] lSum = new int[nums.length];
          int[] rSum = new int[nums.length];
          int[] answer = new int[nums.length];
       
        for(int i= nums.length-2 ; i>=0 ; i--){
            if(i==nums.length-2) rSum[i]= nums[i+1];
            else rSum[i]= nums[i+1]+rSum[i+1];
        }
         for(int i = 1 ; i < nums.length ; i++){
            if(i==1)lSum[i] = nums[i-1];
            else lSum[i] = nums[i-1]+lSum[i-1];
        }
        for(int i= 0 ; i< answer.length ; i++){
            answer[i] = Math.abs(lSum[i]-rSum[i]);
        }
        
        return answer;
    }
}