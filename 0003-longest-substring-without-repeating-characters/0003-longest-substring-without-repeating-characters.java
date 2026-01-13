import java.util.HashMap;
import java.util.Map;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        var lastIndex = new HashMap<Character, Integer>();
        int left = 0;     
        int best = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }

            lastIndex.put(c, right);

            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
