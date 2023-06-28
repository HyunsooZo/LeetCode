class Solution {
    public String makeSmallestPalindrome(String s) {
        int len = s.length();
        char[] answer = new char[len];
        int left = 0, right = len - 1;
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            if (leftChar != rightChar) {
                answer[left] = Character.compare(leftChar, rightChar) > 0 ? rightChar : leftChar;
                answer[right] = Character.compare(leftChar, rightChar) > 0 ? rightChar : leftChar;
            } else {
                answer[left] = leftChar;
                answer[right] = rightChar;
            }
            
            left++;
            right--;
        }
        if (left == right) answer[left] = s.charAt(left);
        return new String(answer);
    }
}
