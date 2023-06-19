class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length()/2 , aCnt = 0 , bCnt = 0;
        char[] a = s.substring(0,half).toCharArray();
        char[] b = s.substring(half,s.length()).toCharArray();
        char[] vowls= new char[]{ 'a' ,'e','i','o' ,'u' ,'A','E','I','O','U'};
    
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j< 10 ; j++){
                if(a[i]==vowls[j]) aCnt++;
                if(b[i]==vowls[j]) bCnt++;
            }   
        }
        return aCnt==bCnt;
    }
}