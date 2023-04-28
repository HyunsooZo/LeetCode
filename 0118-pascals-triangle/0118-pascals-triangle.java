class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0 ; i<numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++){
                if(j==0 || j == i){
                    temp.add(1);
                }else{
                    List<Integer> previous = answer.get(i-1);
                    temp.add(previous.get(j)+previous.get(j-1));
                }
            }
            answer.add(temp);
        }
        return answer;
    }
}