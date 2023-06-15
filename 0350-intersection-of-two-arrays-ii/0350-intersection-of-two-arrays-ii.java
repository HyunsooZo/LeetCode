import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0 , j = 0,len1 = nums1.length , len2 = nums2.length ;
        while(i<len1 && j<len2){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        
        
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int k : list){
            answer[idx++] = k;
        }
        
        return answer;
    }
}