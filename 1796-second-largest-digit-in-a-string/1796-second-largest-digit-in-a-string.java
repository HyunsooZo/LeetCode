class Solution {
    public int secondHighest(String s) {
        s = s.replaceAll("[a-z]","");
        int max = 0,second = -1;
        for(char c : s.toCharArray()){
            int i = Character.getNumericValue(c);
                max = Math.max(max,i);
        }
        for(char c : s.toCharArray()){
            int i = Character.getNumericValue(c);
                if(i==max) continue;
                second = Math.max(second,i);
        }
        return second;
    }
}