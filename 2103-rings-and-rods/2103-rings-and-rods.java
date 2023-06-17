class Solution {
    public int countPoints(String rings) {
        int[][] answer = new int[10][3];
        
        for(int i = 1 ; i < rings.length() ;i++){
            char c = rings.charAt(i);
            char b = rings.charAt(i-1);
            if(Character.isDigit(c)){
                int cc = Character.getNumericValue(c);
                if(b=='R') answer[cc][0]++;
                else if(b=='G') answer[cc][1]++;
                else if(b=='B') answer[cc][2]++;
            }
        }
        int result = 0;
        for(int i = 0 ; i < answer.length ; i++){
            int temp = 0;
            for(int j = 0 ; j < 3 ; j++){
                if(answer[i][j]>0){
                    temp++;
                }
            }    
            if(temp>=3){
                result++;
            }
        }
        return result;
    }
}