import java.util.Random;

public class Solution {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        Random random = new Random();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char prev = (i == 0) ? '?' : chars[i - 1];
                char next = (i == chars.length - 1) ? '?' : chars[i + 1];
                char replacement = getRandomChar(prev, next, random);
                chars[i] = replacement;
            }
        }

        return new String(chars);
    }

    private char getRandomChar(char prev, char next, Random random) {
        char randomChar;
        do {
            randomChar = (char) (random.nextInt(26) + 'a');
        } while (randomChar == prev || randomChar == next);

        return randomChar;
    }
}
