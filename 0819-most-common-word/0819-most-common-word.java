import java.util.*;

class Solution {
    private class freq {
        int num = 0;
        String str;

        freq(int num, String str) {
            this.num = num;
            this.str = str;
        }
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] sArr = paragraph.toLowerCase().split("\\W+");

        for (String s : sArr) {
            map.put(s.trim(), map.getOrDefault(s, 0) + 1);
        }

        for (String s : banned) {
            map.put(s, 0);
        }

        freq maxFreq = new freq(0, "");

        for (String s : sArr) {
            if (map.containsKey(s) && map.get(s) > maxFreq.num) {
                maxFreq.num = map.get(s);
                maxFreq.str = s;
            }
        }

        return maxFreq.str;
    }
}
