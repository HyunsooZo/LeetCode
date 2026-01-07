class Solution {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}