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
        int n = names.length;
        People[] people = new People[n];
        for (int i = 0; i < n; i++) {
            people[i] = new People(names[i], heights[i]);
        }
        
        Arrays.sort(people);
        
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = people[i].name;
        }
        
        return answer;
    }
}
