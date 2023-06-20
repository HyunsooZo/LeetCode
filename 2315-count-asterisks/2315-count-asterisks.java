class Solution {
    public int countAsterisks(String s) {
        int answer = 0;
        boolean isItInPair = false;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);   
            if (c == '|') isItInPair = !isItInPair;
            else if (!isItInPair && c == '*') answer++;  
        }
        return answer;        
    }
}
