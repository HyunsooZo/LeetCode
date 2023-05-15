class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] a = points[0], b = points[1], c = points[2];
        if (Arrays.equals(a, b) || Arrays.equals(a, c) || Arrays.equals(b, c))return false;
        if (a[0] == b[0] && b[0] == c[0]) return false;
        if ((b[1] - a[1]) * (c[0] - b[0]) == (c[1] - b[1]) * (b[0] - a[0])) return false;
        return true;
    }
}
