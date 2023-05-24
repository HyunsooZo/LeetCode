class Solution {
    public int secondHighest(String s) {
        int max = -1, second = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > max) {
                    second = max;
                    max = num;
                } else if (num < max && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}
