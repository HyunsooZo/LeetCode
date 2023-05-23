import java.util.*;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] charOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            charOrder[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!compareWords(words[i], words[i + 1], charOrder)) {
                return false;
            }
        }

        return true;
    }

    private boolean compareWords(String word1, String word2, int[] charOrder) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if (ch1 != ch2) {
                int order1 = charOrder[ch1 - 'a'];
                int order2 = charOrder[ch2 - 'a'];

                if (order1 > order2) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        return len1 <= len2;
    }
}
