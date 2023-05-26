class Solution {
    public String reformat(String s) {
        boolean isFirstDigit = false;
        char[] temp = s.toCharArray();
        List<Character> listNum = new ArrayList<>(), listStr = new ArrayList<>();
        for (char c : temp) {
            if (Character.isDigit(c)) listNum.add(c);
            else listStr.add(c);
        }
        int nLen =listNum.size() , sLen = listStr.size();
        if(nLen==1 && sLen==0) return String.valueOf(listNum.get(0));
        else if(sLen==1 && nLen==0 ) return String.valueOf(listStr.get(0));
        else if (Math.abs(nLen - sLen)>1 )  return "";
        
                  
        if (sLen > nLen)  isFirstDigit = true;
        
        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;
        
        if (isFirstDigit) {
            while (i < sLen && j < nLen) {
                sb.append(listStr.get(i++));
                sb.append(listNum.get(j++));
            }
        } else {
            while (i < nLen && j < sLen) {
                sb.append(listNum.get(j++));
                sb.append(listStr.get(i++));
            }
        }
        if (i < sLen) sb.append(listStr.get(i));
        if (j < nLen) sb.append(listNum.get(j));
        
        return sb.toString();
    }
}
