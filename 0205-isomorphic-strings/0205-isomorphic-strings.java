class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sArray = new int[256],tArray = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i), tChar = t.charAt(i);           
            sArray[sChar] = i + 1;
            tArray[tChar] = i + 1;
        }
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i) , tChar = t.charAt(i);
            if (sArray[sChar] != tArray[tChar]) return false;
        }
        return true;
    }
}