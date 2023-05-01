class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n; 
        while (left <= right) {
            long mid = left + (right - left) /2;
            long coins = mid * (mid + 1) / 2;
            if (coins == n) return (int)mid; 
            if (coins > n) right = mid - 1; 
            else left = mid + 1;
        }
        return (int)right;
    }
}