class Solution {
    public int[] countBits(int n) {
        if(n==0) return new int[]{0};
        if(n==1) return new int[]{0,1};
        int[] answer = new int[n+1];
        answer[0] = 0;
        answer[1] = 1;
        for(int i = 2 ; i<=n ; i++ ) answer[i] = Integer.bitCount(i);
        return answer;
    }
}
