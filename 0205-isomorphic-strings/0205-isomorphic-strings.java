class Solution {
      public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())  return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!map1.containsKey(sChar) && !map2.containsKey(tChar)) {
                map1.put(sChar, tChar);
                map2.put(tChar, sChar);
            } else if (map1.getOrDefault(sChar, tChar) != tChar || 
                       map2.getOrDefault(tChar, sChar) != sChar) {
                return false;
            }
        }
        return true;
    }
}