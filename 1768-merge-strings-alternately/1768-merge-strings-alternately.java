class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        Deque<Character> q1 = new LinkedList<>();
        Deque<Character> q2 = new LinkedList<>();
        for(char c : word1.toCharArray()){
            q1.offer(c);
        }
        for(char c : word2.toCharArray()){
            q2.offer(c);
        }
        int maxLen = Math.max(q1.size(),q2.size());
        for(int i = 0 ; i < maxLen ; i++){
            if(!q1.isEmpty()){
                answer.append(q1.poll());
            }
            if(!q2.isEmpty()){
                answer.append(q2.poll());
            }
        }
        return answer.toString();
    }
}