class Solution {
    public int numWaterBottles(int bottles, int exchange) {
        int answer = bottles, empty = answer, reminder=0;
        while(empty/exchange>=1){
            bottles = empty/exchange;
            reminder = empty%exchange;
            answer += bottles;
            empty = reminder + bottles;
        }
        return answer;
    }
}