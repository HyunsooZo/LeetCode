class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) sb.append(c-('a'-1));
        s= sb.toString();
        for(int i = 0 ; i< k ; i++){
            s = convert(s);
        }
        return Integer.parseInt(s);
    }
    public String convert(String s){
        int temp = 0;

        for(char c : s.toCharArray()){
            temp+=Character.getNumericValue(c);
         System.out.print(c+" ");
        }
        return String.valueOf(temp);
    }
}