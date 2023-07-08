class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        int totalChars = s.length();
        double percentage = (count * 100.0) / totalChars;
        return (int) Math.floor(percentage);
    }
}
