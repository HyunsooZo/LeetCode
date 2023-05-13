class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) sb.append(c-('a'-1));
        while(k>0){
            sum = 0;
            for(char c: sb.toString().toCharArray()){
                sum+=Character.getNumericValue(c);
            }
            sb = new StringBuilder(String.valueOf(sum));
            k--;
        }
        return sum;
    }
}