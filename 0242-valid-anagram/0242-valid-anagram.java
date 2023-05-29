import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        int slen =  s.length(), tlen =  t.length();
        if (slen != tlen) return false;

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < slen; i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            if (!charCount.containsKey(c) || charCount.get(c) == 0) return false;
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}
