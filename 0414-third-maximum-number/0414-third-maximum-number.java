class Solution {
    public int thirdMax(int[] nums) {
        Integer fst = null , sec = null , thd = null;
        for(Integer i : nums){
            if(i.equals(fst)||i.equals(sec)||i.equals(thd)){
                continue;
            }
            if(fst == null || i > fst){
                thd = sec;
                sec = fst;
                fst = i;
            }else if(sec == null || i> sec){
                thd = sec;
                sec = i;
            }else if(thd == null || i> thd){
                thd = i;
            }
        }
        return thd==null?fst:thd;
    }
}