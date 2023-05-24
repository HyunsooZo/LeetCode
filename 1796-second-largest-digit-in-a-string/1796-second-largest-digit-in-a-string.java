class Solution {
    public int secondHighest(String s) {
        int max = 0,second = -1;
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)) continue;
            int i = Character.getNumericValue(c);
            max = Math.max(max,i);
        }
        for(char c : s.toCharArray()){
            int i = Character.getNumericValue(c);
            if(!Character.isDigit(c) || max ==i) continue;
            second = Math.max(second,i);
        }
        return second;
    }
}