import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int answer = 0;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i : nums){
            if(i<a){
                a = i;
            }
            if(i>b){
                b = i;
            }
        }
        while(answer<=0){
            if(a%b==0){
                answer = b;
            }else if(a%b!=0){
                int temp = a;
                a = b;
                b = temp%b;
            }
        }
        return answer;
    }
}