class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0 ;
        for(int i: arr){
            if(i%2!=0){
                cnt++;
                if(cnt>=3){
                    return true;
                }
            }else{
                cnt =0;
            }
        }
        return false;
    }
}