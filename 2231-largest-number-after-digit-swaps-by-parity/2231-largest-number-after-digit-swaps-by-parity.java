class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);
        char[] charArr = str.toCharArray();
        int n = charArr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(charArr[i]<charArr[j] && charArr[i]%2==0 && charArr[j]%2==0)
                     swap(charArr,i,j);
                else if(charArr[i]<charArr[j] && charArr[i]%2!=0 && charArr[j]%2!=0)
                     swap(charArr,i,j);
            }
        }
        return Integer.parseInt(new String(charArr));
    }
    public void swap(char[] charArr, int idx1, int idx2){
        char temp = charArr[idx1];
        charArr[idx1] = charArr[idx2];
        charArr[idx2] = temp;
    }
}