class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int length = s.length();
        while(index < length && s.charAt(index) == ' '){
            index++;    
        } 
        int sign = 1;
        boolean isIndexSmallerThanLength = index < length;
        if(isIndexSmallerThanLength){
            boolean isPlusOrMinus = s.charAt(index) == '+' || s.charAt(index) == '-';
            if(isPlusOrMinus){
                if(s.charAt(index) == '-'){
                    sign = -1;
                }
                index++;
            }
        }
        
        long result = 0;
        while (index < length && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        
        var answer = (int) result * sign;
        return answer;
    }
}