class Solution {
    public String destCity(List<List<String>> paths) {
        String answer = "";
        Map<String,String> map = new HashMap<>();
        for(List<String> list: paths){
            map.put(list.get(0),list.get(1));
        }
        for(List<String> list: paths){
            if(!map.containsKey(list.get(1))){
                answer= list.get(1);
            }
        }
        return answer;
    }
}