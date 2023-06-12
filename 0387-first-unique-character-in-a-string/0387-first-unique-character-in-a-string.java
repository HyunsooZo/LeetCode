class Solution {
    public int firstUniqChar(String s) {
        String[] arr = s.split("");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(map.get(arr[i])==1) return i;
        }
        return -1;
    }
}