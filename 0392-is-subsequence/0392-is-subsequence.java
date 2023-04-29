class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0, tIdx = 0;
        while(sIdx < s.length() && tIdx < t.length()){
            if(s.charAt(sIdx)==t.charAt(tIdx)) sIdx++;
            tIdx++;
        }
        return sIdx==s.length()?true:false;
    }
}