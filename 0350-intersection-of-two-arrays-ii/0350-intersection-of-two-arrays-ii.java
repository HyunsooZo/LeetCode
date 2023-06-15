import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
 // 1. using array
    int[] map = new int[1001]; //각 value를 index(key)로 갯수 저장 >> 1 <= nums1.length, nums2.length <= 1000
    for(int num1 : nums1){
        map[num1]++;
    }
    // check intersection
    List<Integer> resultList = new ArrayList<>();
    for(int num2 : nums2){
        if(map[num2] > 0){ //교집합
            resultList.add(num2);
            map[num2]--;
        }
    }
    // convert List to Array        
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size() ; i++) {
        result[i] = resultList.get(i);
    }
    return result;
    }
}