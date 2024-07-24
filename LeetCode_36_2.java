public class LeetCode_36_2 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            boolean[][] row = new boolean[9][10];
            boolean[][] col = new boolean[9][10];
            boolean[][] grids = new boolean[9][10];

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '.')
                        continue;
                    int num = board[i][j] - '0';
                    int t = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || grids[t][num])
                        return false;
                    row[i][num] = true;
                    col[j][num] = true;
                    grids[t][num] = true;
                }
            }
            return true;
        }
    }
}
