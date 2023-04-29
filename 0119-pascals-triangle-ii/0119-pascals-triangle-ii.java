class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                if(j==0 || j ==i ){
                    temp.add(1);
                }else{
                    List<Integer> prev = triangle.get(i-1);
                    temp.add(prev.get(j)+prev.get(j-1));
                }
            }
             triangle.add(temp);
        }
        return triangle.get(rowIndex);
    }
}