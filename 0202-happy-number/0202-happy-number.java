class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> duplChk = new HashSet<>();
        return isHappyHelper(n, duplChk);
    }

    private boolean isHappyHelper(int n, HashSet<Integer> duplChk) {
        if (n == 1) return true;
        if (n == 4 || !duplChk.add(n)) return false;
        int next = 0;
        while (n != 0) {
            int digit = n % 10;
            next += digit * digit;
            n /= 10;
        }
        return isHappyHelper(next, duplChk);
    }
}
