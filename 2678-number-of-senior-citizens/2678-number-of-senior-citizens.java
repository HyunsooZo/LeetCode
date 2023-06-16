class Solution {
    public int countSeniors(String[] details) {
        int answer = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60) {
                answer++;
            }
        }
        return answer;
    }
}
