import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        for(int i : nums1) map1.add(i);
        for(int i : nums2) map2.add(i);
        map1.retainAll(map2);
        return map1.stream().mapToInt(Integer::intValue).toArray();
    }
}