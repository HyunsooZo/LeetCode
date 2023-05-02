class Solution {
    int answer = 0; 
    
    public int addDigits(int num) {
        recursive(num);
        return answer;
    }
    
    public void recursive(int num){
        answer = 0;
        if(num < 10) {
            answer += num;
            return;
        }
        while(num>=1){
            answer += num % 10;
            num/=10;
        }
        
        if(answer >= 10) recursive(answer);
    }
}
