import java.util.*;
class People implements Comparable<People> {
    String name;
    int height;
    
    public People(String name, int height){
        this.name = name;
        this.height = height;
    }
    
    @Override
    public int compareTo(People other){
        return other.height - this.height;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<People> q = new PriorityQueue<>();
        for(int i = 0 ; i < names.length; i++){
            People a = new People(names[i],heights[i]);
            q.offer(a);
        }
        String [] answer= new String[names.length];
        int idx = 0;
        while(!q.isEmpty()){
            answer[idx++] = q.poll().name;
        }
        return answer;
    }
}