class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        
        int a = n;
        
        if (n % 2 == 0){ 
            sb.append('a');
            a = n-1;
        }
        
        for(int i = 0 ; i < a ; i++) sb.append('b');
        
        return sb.toString();
    }
}
