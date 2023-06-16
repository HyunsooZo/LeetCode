class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        
        if (n % 2 == 0) {
            sb.append('a');
            sb.append(String.valueOf('b').repeat(n - 1));
        } else {
            sb.append(String.valueOf('a').repeat(n));
        }
        
        return sb.toString();
    }
}
