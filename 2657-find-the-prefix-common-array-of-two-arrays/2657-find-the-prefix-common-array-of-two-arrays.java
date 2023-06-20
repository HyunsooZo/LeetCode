import java.util.*;
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int[] prefixCommon = new int[n];
        
        Set<Integer> commonSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            commonSet.add(A[i]);
            
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (commonSet.contains(B[j])) {
                    count++;
                }
            }
            
            prefixCommon[i] = count;
        }
        
        return prefixCommon;
    }
}

