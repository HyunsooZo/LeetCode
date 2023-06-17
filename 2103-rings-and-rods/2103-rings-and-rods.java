class Solution {
    public int countPoints(String rings) {
        int[][] answer = new int[10][3];
        char[] ringsArr = rings.toCharArray();
        for(int i = 1 ; i < ringsArr.length ;i++){
            char cur = ringsArr[i] , prev = ringsArr[i-1];
            if(Character.isDigit(cur)){
                int idx = Character.getNumericValue(cur);
                if(prev=='R') answer[idx][0]++;
                else if(prev=='G') answer[idx][1]++;
                else if(prev=='B') answer[idx][2]++;
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