class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int len = Math.max(word1.length(),word2.length());
        for(int i = 0 ; i < len ; i++ ){
            if(i<word1.length()){
                answer.append(word1.charAt(i));
            }
            if(i<word2.length()){
                answer.append(word2.charAt(i));
            }
        }
        return answer.toString();
    }
}