class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; // 0부터 25까지의 숫자
            char ch = (char) ('A' + remainder);
            sb.append(ch);
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
