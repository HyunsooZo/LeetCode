class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c=='{' || c=='(' ||c=='['){
                stack.push(c);
            }else if(!stack.empty()){
                if(c=='}'&& stack.peek()=='{'||c==')'&&stack.peek()=='(' ||c==']'&&stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.empty()?true:false;
    }
}