import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        int slen =  s.length(), tlen =  t.length();
        if (slen != tlen) return false;
        int[] alphabet = new int[26];
        for(char c: s.toCharArray()){
            alphabet[c-'a']++;
        }
        for(char c: t.toCharArray()){
            if(alphabet[c-'a']==0) return false;
            alphabet[c-'a']--;
        }
        for(int i : alphabet){
            if (i!=0) return false;
        }
        return true;
    }
}
