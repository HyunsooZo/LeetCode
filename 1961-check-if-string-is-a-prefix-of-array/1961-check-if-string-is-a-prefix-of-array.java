class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder(s);
        for (String str : words) {
            if (sb.indexOf(str) != 0) return false;
        
            sb = new StringBuilder(sb.substring(str.length())); 
        
            if (sb.length() == 0) return true;
        }
        return false;
    }
}