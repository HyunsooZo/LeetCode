class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int longestStartIndex = 0;
        int longestLength = 1;

        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {

                int currentLength = end - start + 1;

                if (currentLength <= longestLength) {
                    continue;
                }

                if (isPalindrome(s, start, end)) {
                    longestStartIndex = start;
                    longestLength = currentLength;
                }
            }
        }

        return s.substring(longestStartIndex, longestStartIndex + longestLength);
    }

    private boolean isPalindrome(String s, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}