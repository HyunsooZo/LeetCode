class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int[] i : image){
            int left = 0 , right = i.length-1;
            while(left<right){
                int temp = i[left];
                i[left] = i[right];
                i[right] = temp;
                left++;
                right--;
            }
        }
             
        for(int[] i : image){
            for(int j = 0 ; j<i.length ; j++){
                if(i[j]==1) i[j]=0;
                else i[j]=1;
            }
        }
        return image;
    }
}
