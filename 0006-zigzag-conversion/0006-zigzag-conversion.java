class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        var rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean downflag = true;

        for (var c : s.toCharArray()) {
            rows[row].append(c);

            if (row == 0) downflag = true;
            else if (row == numRows - 1) downflag = false;

            row += downflag ? 1 : -1;
        }

        var answer = new StringBuilder();
        for (var sb : rows) {
            answer.append(sb);
        }

        return answer.toString();
    }
}
