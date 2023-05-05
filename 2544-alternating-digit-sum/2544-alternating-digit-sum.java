class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        while(n>=1){
            temp.add(0,n%10);
            n/=10;
        }
        int answer = 0;
        for(int i = 0 ; i < temp.size() ; i++){
            if(i%2==0 ){
                answer+= temp.get(i);
            }else {
                answer+= -temp.get(i);
            }
        }
        return answer;
    }
} 