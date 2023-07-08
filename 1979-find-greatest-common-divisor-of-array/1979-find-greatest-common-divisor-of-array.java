import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int a = nums[0] ;
        int b = nums[nums.length-1] ;
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