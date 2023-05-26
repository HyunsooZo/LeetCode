class Solution {
    public String reformat(String s) {
        boolean isFirstDigit = false;
        char[] temp = s.toCharArray();
        List<Character> listNum = new ArrayList<>(), listStr = new ArrayList<>();
        for (char c : temp) {
            if (Character.isDigit(c)) listNum.add(c);
            else listStr.add(c);
        }
        
        if(listNum.size()==1 && listStr.size()==0) return String.valueOf(listNum.get(0));
        else if(listStr.size()==1 && listNum.size()==0 ) return String.valueOf(listStr.get(0));
        else if (Math.abs(listNum.size() - listStr.size())>1 )  return "";
        
                  
        if (listStr.size() > listNum.size())  isFirstDigit = true;
        
        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;
        
        if (isFirstDigit) {
            while (i < listStr.size() && j < listNum.size()) {
                sb.append(listStr.get(i++));
                sb.append(listNum.get(j++));
            }
        } else {
            while (i < listNum.size() && j < listStr.size()) {
                sb.append(listNum.get(j++));
                sb.append(listStr.get(i++));
            }
        }
        if (i < listStr.size()) sb.append(listStr.get(i));
        if (j < listNum.size()) sb.append(listNum.get(j));
        
        return sb.toString();
    }
}
