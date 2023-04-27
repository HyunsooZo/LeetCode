class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int hayLen = haystack.length();
        int nidLen = needle.length();
        for (int i = 0; i <= hayLen - nidLen; i++) {
            if (haystack.substring(i, i + nidLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}