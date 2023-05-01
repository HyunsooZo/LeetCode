class Solution {
    public int arrangeCoins(int n) {
        int i = 1 , cnt =0;
        while(n>=i){
            n-=i;
            i++;
            cnt++;
        }
        return cnt;
    }
}
