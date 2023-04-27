class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0){
            return false;   
        }else if(x<10){
            return true;
        }
        StringBuilder comparison = new StringBuilder();
        comparison.append(x);
        String temp = comparison.toString();
        if(temp.equals(comparison.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}