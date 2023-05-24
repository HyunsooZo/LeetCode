class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] temp = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++) temp[indices[i]] = s.charAt(i);
        for(char c: temp) sb.append(c);
        return sb.toString();
    }
}