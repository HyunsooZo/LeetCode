class Solution {
    public int prefixCount(String[] words, String pref) {
        int answer = 0;
        for(String s : words){
            if(s.startsWith(pref)){
                answer++;
            }
        }
        return answer;
    }
}