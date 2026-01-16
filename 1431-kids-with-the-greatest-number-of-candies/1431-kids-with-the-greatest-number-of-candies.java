class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (var c : candies) {
            max = Math.max(max, c);
        };

        var result = new ArrayList<Boolean>();
        for (var c : candies) {
            result.add(c + extraCandies >= max);
        }
        return result;
    }
}