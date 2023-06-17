import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int len = seats.length ,moves = 0;
        for (int i = 0; i < len; i++) {
            moves += Math.abs(students[i] - seats[i]);
        }
        return moves;
    }
}
