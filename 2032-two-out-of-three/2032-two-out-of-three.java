class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] arr1 = new boolean[101], arr2 = new boolean[101], arr3 = new boolean[101];
        List<Integer> answer = new ArrayList<>();
        for(int i : nums1) arr1[i] = true;
        for(int i : nums2) arr2[i] = true;
        for(int i : nums3) arr3[i] = true;
        
        for(int i = 1 ; i <= 100 ; i++){
            if((arr1[i]||arr2[i]) && (arr2[i]||arr3[i]) && (arr3[i]||arr1[i])) answer.add(i);
        }
        return answer;
    }
}