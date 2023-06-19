class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length()/2 , aCnt = 0 , bCnt = 0;
        char[] a = s.substring(0,half).toCharArray();
        char[] b = s.substring(half,s.length()).toCharArray();
    
        for(int i = 0 ; i < a.length ; i++){
            if (a[i] == 'a' || a[i] == 'e' || 
                a[i] == 'i' || a[i] == 'o' || 
                a[i] == 'u' || a[i] == 'A' || 
                a[i] == 'E' || a[i] == 'I' || 
                a[i] == 'O' || a[i] == 'U') {
                aCnt++;
            }
            if (b[i] == 'a' || b[i] == 'e' || 
                b[i] == 'i' || b[i] == 'o' || 
                b[i] == 'u' || b[i] == 'A' || 
                b[i] == 'E' || b[i] == 'I' || 
                b[i] == 'O' || b[i] == 'U') {
                bCnt++;
            }
            
        }

        return aCnt==bCnt;
    }
}