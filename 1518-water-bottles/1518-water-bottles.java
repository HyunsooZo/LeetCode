class Solution {
    public int numWaterBottles(int bottles, int exchange) {
        int answer = bottles;
        int empty = answer;
        int reminder=0;
        while(empty/exchange>=1){
            bottles = empty/exchange;
            reminder = empty%exchange;
            answer = answer + bottles;
            empty = reminder + bottles;
        }
        return answer;
    }
}