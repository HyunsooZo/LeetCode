class Solution {
    public int countAsterisks(String s) {
        int answer = 0;
        s = s.replaceAll("[^//*//|]","");
        boolean isItInPair = false;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c=='|' && isItInPair) isItInPair = false;
            else if(c=='|' && !isItInPair) isItInPair = true;
            
            if(!isItInPair){
                if(c!='|') answer++;
            }
        }
        return answer;        
    }
}