public class Solution {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char prev = (i == 0) ? '?' : chars[i - 1];
                char next = (i == chars.length - 1) ? '?' : chars[i + 1];
                char replacement = getRandomChar(prev, next, alphabet);
                chars[i] = replacement;
            }
        }

        return new String(chars);
    }

    private char getRandomChar(char prev, char next, char[] alphabet) {
        for (char c : alphabet) {
            if (c != prev && c != next) {
                return c;
            }
        }
        return '?'; 
    }
}
