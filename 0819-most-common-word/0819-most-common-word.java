import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] sArr = paragraph.toLowerCase().split("\\W+");

        for (String s : sArr) map.put(s.trim(), map.getOrDefault(s, 0) + 1);

        for (String s : banned) map.put(s, 0);

        int freqCnt=0;
        String freqStr="";

        for (String s : sArr) {
            if (map.containsKey(s) && map.get(s) > freqCnt) {
                freqCnt = map.get(s);
                freqStr = s;
            }
        }

        return freqStr;
    }
}
